import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.postgresql.Driver;

public class SQLInjection {
    public static void main(String[] args) {
        test1("Alice");
        test1("Dave");
        // SQL インジェクション
//        test1("'; UPDATE account SET password = 'HACKED' --");

//        test2("Alice");
//        test2("Dave");
        // SQL インジェクション
//        test2("'; UPDATE account SET password = 'HACKED' --");
    }
    
    /**
     * 通常の Statement を使うと SQL インジェクションの危険が伴う。
     */
    public static void test1(String username) {
        Driver driver = new Driver();
        String propertyPath = "jdbc.properties";

        Properties properties = new Properties();
        try {
            properties.load(new FileReader(propertyPath));
        } catch (IOException e) {
            System.err.println("Failed to read the property file: " + propertyPath);
            e.printStackTrace();
            return;
        }

        String url = properties.getProperty("url");
        Properties info = new Properties();
        info.setProperty("user", properties.getProperty("user"));
        info.setProperty("password", properties.getProperty("password"));

        String sql = "SELECT password FROM account WHERE username = '" + username + "'";
        
        try (
                Connection con = driver.connect(url, info);
                Statement smt = con.createStatement();
        ) {

            ResultSet rs = smt.executeQuery(sql);

            if (rs.next()) {
                System.out.println("The password of " + username + " is '" + rs.getString("password") + "'.");
            } else {
                System.out.println("There is no user called '" + username + "'.");
            }

        } catch (SQLException e) { // データベース操作時の例外処理
            System.err.println("Error happened when I try to access the database: " + properties.getProperty("url"));
            e.printStackTrace();
        }
    }
    
    /**
     * PreparedStatement で SQL インジェクションのリスクを回避。
     */
    public static void test2(String username) {
        Driver driver = new Driver();
        String propertyPath = "jdbc.properties";

        Properties properties = new Properties();
        try {
            properties.load(new FileReader(propertyPath));
        } catch (IOException e) {
            System.err.println("Failed to read the property file: " + propertyPath);
            e.printStackTrace();
            return;
        }

        String url = properties.getProperty("url");
        Properties info = new Properties();
        info.setProperty("user", properties.getProperty("user"));
        info.setProperty("password", properties.getProperty("password"));

        String sql = "SELECT password FROM account WHERE username = ?"; // SQL 文の「テンプレート」を用意する
        
        try (
                Connection con = driver.connect(url, info);
                PreparedStatement smt = con.prepareStatement(sql);
        ) {
            smt.setString(1, username); // 文中の最初の「?」をユーザ名の文字列に置き換える

            ResultSet rs = smt.executeQuery();

            if (rs.next()) {
                System.out.println("The password of " + username + " is '" + rs.getString("password") + "'.");
            } else {
                System.out.println("There is no user called '" + username + "'.");
            }

        } catch (SQLException e) { // データベース操作時の例外処理
            System.err.println("Error happened when I try to access the database: " + properties.getProperty("url"));
            e.printStackTrace();
        }
    }
}
