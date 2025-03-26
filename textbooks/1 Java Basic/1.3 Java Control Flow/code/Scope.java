public class Scope {
    public static void main(String[] args) {

        // x = 0; // x は使えなくて、コンパイルエラーが出る

        // コードブロックに以下のコードを配置
        {

            // x = 0; // x は使えなくて、コンパイルエラーが出る

            int x = 100;

            x = 0; // x は使える
            System.out.println(x); // => 0

        } // コードブロック終了

        // x = 0; // x は使えなくて、コンパイルエラーが出る
    }
}
