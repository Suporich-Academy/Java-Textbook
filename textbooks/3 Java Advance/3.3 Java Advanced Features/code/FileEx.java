import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("a.txt"); // プログラムディレクトリにあるファイル「a.txt」のオブジェクトを作成する
        if (file.exists()) { // a.txt が存在する場合
            System.out.println(file.length()); // そのサイズを出力する
        } else { // ファイルが存在しない場合
            try {
                file.createNewFile(); // このファイルを作成する
                System.out.println(file.getAbsoluteFile()); // ファイルの絶対パスを出力する
            } catch (IOException e) {
                System.out.println("Failed to create the file.");
                e.printStackTrace();
            }
        }

        File dir = new File("test"); // 「test」フォルダのオブジェクトを作成する
        dir.mkdir(); // フォルダを作成する（まだ存在しない場合）

        // フォルダの下に 2 つのファイルを作成する
        file = new File("test/a.txt");
        file.createNewFile();

        file = new File("test/b.png");
        file.createNewFile();

        System.out.println(Arrays.toString(dir.list())); // 出力フォルダ内のファイル一覧
    }
}
