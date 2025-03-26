import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.postgresql.Driver;

public class JDBCExample {
    public static void main(String[] args) throws Exception {
        test1();
//      test2();
    }
    
    /**
     * 基本的な接続方法、例外処理なし。
     */
    public static void test1() throws Exception {
        // 1. ドライバの登録と Driver オブジェクトの作成
        Driver driver = new Driver();

        // 2. データベースのリンクを取得する（方法 1：コードに直接設定を入力する）
        String url = "jdbc:postgresql://localhost:5432/hello"; // データベースのアドレスを設定する
        Properties info = new Properties();
        info.setProperty("user", "postgres"); // ユーザー名の設定
        info.setProperty("password", "123456"); // パスワードの設定

        Connection con = driver.connect(url, info); // リンクの作成

        // 2. データベースのリンクを取得する（方法 2：Properties ファイルを使用して設定）
//        Properties properties = new Properties(); // 設定情報を格納する Properties オブジェクトを作る
//        properties.load(new FileReader("hello.properties"));
//        
//        String url = properties.getProperty("url"); // データベースアドレスの設定
//        Properties info = new Properties();
//        info.setProperty("user", properties.getProperty("user")); // ユーザー名の設定
//        info.setProperty("password", properties.getProperty("password")); // パスワードの設定
//        
//        Connection connect = driver.connect(url, info); // リンクを作成

        // 3. SQL を実行
        Statement smt = con.createStatement();

        String sql = "SELECT * FROM student";

        ResultSet rs = smt.executeQuery(sql); // 結果セットを取得

        // 全てのデータの id、name と score を出力
        while (rs.next()) {
            System.out.println("[id: " + rs.getInt("id") + ", name: " + rs.getString("name") + ", score: "
                    + rs.getInt("score") + "]");
        }

        // 4. リンクを閉じる
        smt.close();
        con.close();
    }

    /**
     * try-with-resources 文で例外処理を行う。
     */
    public static void test2() {
        // 1. ドライバの登録と Driver オブジェクトの作成
        Driver driver = new Driver();
        String propertyPath = "hello.properties";

        // 2. データベースのリンクを取得する
        Properties properties = new Properties(); // 設定情報を格納する Properties オブジェクトを作る
        try {
            properties.load(new FileReader(propertyPath));
        } catch (IOException e) { // プロパティファイルを読み込むとき発生した例外を処理
            System.err.println("Failed to read the property file: " + propertyPath);
            e.printStackTrace();
            return;
        }

        String url = properties.getProperty("url"); // データベースアドレスの設定
        Properties info = new Properties();
        info.setProperty("user", properties.getProperty("user")); // ユーザー名の設定
        info.setProperty("password", properties.getProperty("password")); // パスワードの設定

        try (
                Connection con = driver.connect(url, info);
                Statement smt = con.createStatement();
        ) {
            // 3. SQL を実行
            String sql = "SELECT * FROM student";

            ResultSet rs = smt.executeQuery(sql); // 結果セットを取得

            // 全てのデータの id、name と score を出力
            while (rs.next()) {
                System.out.println("[id: " + rs.getInt("id") + ", name: " + rs.getString("name") + ", score: "
                        + rs.getInt("score") + "]");
            }

        } catch (SQLException e) { // データベースを操作するとき発生した例外を処理
            System.err.println("Error happened when I try to access the database: " 
                    + properties.getProperty("url") + ".");
            e.printStackTrace();
        }
    }
}
