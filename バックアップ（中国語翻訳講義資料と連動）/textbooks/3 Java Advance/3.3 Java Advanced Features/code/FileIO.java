import java.io.*;

public class FileIO {
    public static void main(String[] args) {
        File file = new File("a.txt"); // a.txt ファイルを選択する

        try ( // ファイルに接続する Reader を作成する
                FileReader fileReader = new FileReader(file);
                BufferedReader reader = new BufferedReader(fileReader)
        ) {
            System.out.println(reader.lines().toList()); // 各行の文字列を取得する
        } catch (FileNotFoundException e) {
            System.out.println("Cannot open file: " + file);
        } catch (IOException e) {
            System.out.println("Cannot read file: " + file);
        }

        file = new File("b.txt"); // b.txt ファイルを選択する

        try ( // ファイルに接続する Writer を作成する
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter writer = new BufferedWriter(fileWriter)
        ) {
            // 文字列をファイルに出力する
            writer.write("Line 1");
            writer.newLine();
            writer.write("Line 2");
            writer.newLine();
            writer.write("Line 3");
            writer.newLine();
        } catch (FileNotFoundException e) {
            System.out.println("Cannot open file: " + file);
        } catch (IOException e) {
            System.out.println("Cannot write file: " + file);
        }
    }
}
