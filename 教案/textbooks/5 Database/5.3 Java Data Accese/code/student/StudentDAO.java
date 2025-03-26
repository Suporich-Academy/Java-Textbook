package student;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.postgresql.Driver;

public class StudentDAO {
    private static final String PROPERTY_PATH = "dao.properties";
    private static final Driver DRIVER = new Driver();
    
    private String url = "";
    private String user = "";
    private String password = "";

    private Connection con = null; // データベースとのリンク
    
    public StudentDAO() {
        // プロパティファイルを読み込む
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(PROPERTY_PATH));
        } catch (IOException e) {
            System.err.println("Failed to read the property file: " + PROPERTY_PATH + ".");
            e.printStackTrace();
            return;
        }
        
        url = properties.getProperty("url");
        user = properties.getProperty("user");
        password = properties.getProperty("password");

        // リンクを作る
        Properties info = new Properties();
        info.setProperty("user", user);
        info.setProperty("password", password);

        try {
            con = DRIVER.connect(url, info);
        } catch (SQLException e) { // データベース接続時の例外を処理
            System.err.println("Error happened when I try to connect to the database: " + url + ".");
            e.printStackTrace();
        }
    }

    /**
     * student テーブルをアクセスして、全ての生徒のデータを獲得。
     */
    public List<StudentDTO> findAll() {
        List<StudentDTO> result = new ArrayList<>();
        
        String sql = "SELECT * FROM student";
        
        try (Statement smt = con.createStatement()) {
            ResultSet rs = smt.executeQuery(sql);
            
            // データベースから検索して得たデータに基づいて生徒のオブジェクトを作成
            while (rs.next()) {
                result.add(new StudentDTO(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("subject"),
                        rs.getString("gender")
                ));
            }
            
        } catch (SQLException e) { // データベース操作時の例外を処理
            System.err.println("Error happened when I try to get students' data.");
            e.printStackTrace();
        }
        
        return result;
    }

    /**
     * 生徒一人のデータを student テーブルに挿入。
     */
    public int save(StudentDTO student) {        
        String sql = "INSERT INTO student VALUES (?, ?, ?, ?, ?)";
        int result = 0;
        
        try (PreparedStatement smt = con.prepareStatement(sql)) {
            // 生徒のオブジェクトを使って、SQL 文を完成
            smt.setInt(1, student.getId());
            smt.setString(2, student.getName());
            smt.setInt(3, student.getAge());
            smt.setString(4, student.getSubject());
            smt.setString(5, student.getGender());
            
            result = smt.executeUpdate();
            
        } catch (SQLException e) { // データベース操作時の例外を処理
            System.err.println("Error happened when I try to save the student: " + student + ".");
            e.printStackTrace();
        }
        
        return result;
    }
    
    /**
     * 終わったらリソースを解放。
     */
    public void close() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println("Error happened when I try to close the connection: " + url + ".");
                e.printStackTrace();
            }
        }
    }
}
