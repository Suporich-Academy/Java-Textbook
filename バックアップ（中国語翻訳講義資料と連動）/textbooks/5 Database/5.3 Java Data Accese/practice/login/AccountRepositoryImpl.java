package login;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

import org.postgresql.Driver;

public class AccountRepositoryImpl implements AccountRepository {
    private static final String PROPERTY_PATH = "jdbc.properties";
    private static final Driver DRIVER = new Driver();
    
    private String url = "";
    private String user = "";
    private String password = "";

    private Connection con = null; // データベースへのリンク
    
    public AccountRepositoryImpl() {
        // 設定ファイル読み込み
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

        // リンクの作成
        Properties info = new Properties();
        info.setProperty("user", user);
        info.setProperty("password", password);

        try {
            con = DRIVER.connect(url, info);
        } catch (SQLException e) { // データベースへの接続時の例外処理
            System.err.println("Error happened when I try to connect to the database: " + url + ".");
            e.printStackTrace();
        }
    }

    /**
     * データベースの account テーブルにアクセスし、すべてのアカウントデータのリストを取得する。
     */
    public List<Account> findAll() {
        List<Account> result = new ArrayList<>();
        
        String sql = "SELECT * FROM account";
        
        try (Statement smt = con.createStatement()) {
            ResultSet rs = smt.executeQuery(sql);
            
            // データベースで照会されたデータからアカウントオブジェクトを作成し、リストに入れる
            while (rs.next()) {
                result.add(new Account(
                        rs.getString("username"),
                        rs.getString("password")
                ));
            }
            
        } catch (SQLException e) { // データベース操作時の例外処理
            System.err.println("Error happened when I try to get accounts' data.");
            e.printStackTrace();
        }
        
        return result;
    }
    
    /**
     * データベースの account テーブルにアクセスし、ユーザー名は指定の文字列のものを取得する。
     */
    public Optional<Account> findAccountByUsername(String username) {
        String sql = "SELECT * FROM account WHERE username = ?";
        Account result = null;
        
        try (PreparedStatement smt = con.prepareStatement(sql)) {
            smt.setString(1, username);
            
            ResultSet rs = smt.executeQuery();
            
            // データベースから対応するデータを取得し、アカウントオブジェクトを作成
            if (rs.next()) {
                result = new Account(
                        rs.getString("username"),
                        rs.getString("password")
                );
            }
            
        } catch (SQLException e) { // データベース操作時の例外処理
            System.err.println("Error happened when I try to get " + username +  "'s data.");
            e.printStackTrace();
        }
        
        // 戻り値が null（ユーザー名が存在しない）になる可能性があるので、ここでは便利のために Optional クラスを使用
        return Optional.ofNullable(result);
    }

    /**
     * データベースのアカウントテーブルにアクセスし、アカウントデータを保存する。
     */
    public int save(Account account) {        
        String sql = "INSERT INTO account VALUES (?, ?)";
        int result = 0;
        
        try (PreparedStatement smt = con.prepareStatement(sql)) {
            // パラメータで受けたアカウントオブジェクトを使用してステートメントを設定する
            smt.setString(1, account.getUsername());
            smt.setString(2, account.getPassword());

            result = smt.executeUpdate();
            
        } catch (SQLException e) { // データベース操作時の例外処理
            System.err.println("Error happened when I try to save the account: " + account + ".");
            e.printStackTrace();
        }
        
        return result;
    }
    
    /**
     * 使用後のリソースの解放。
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
