import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        // Pattern クラスを使用し、文字列が正規表現にマッチするかどうかを判断する
        System.out.println(Pattern.matches("A[pqr]+le", "Apple"));

        // String クラスの matches() メソッドを使用し、正規表現にマッチするかどうかを判断する
        String str = "Apple";
        System.out.println(str.matches("A[pqr]+le"));

        // Pattern クラスと Matcher クラスのメソッドを使用し、正規表現にマッチする全ての部分文字列を検索する
        Matcher matcher = Pattern.compile("A[pqr]+le").matcher("Apple Abcde Appqqqrle");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
