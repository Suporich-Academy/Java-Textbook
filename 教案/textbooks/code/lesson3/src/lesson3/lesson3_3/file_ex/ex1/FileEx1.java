package lesson3.lesson3_3.file_ex.ex1;

import java.io.File;
import java.io.IOException;

public class FileEx1 {
	public static void main(String[] args) {
		//ファイルクラスを使ってファイルを指定する
		File file = new File("practice.txt");
		//もし、practice.txtが存在していたら、ファイルサイズを出力します
		//存在していなかった場合、practice.txtを作成する
		if(file.exists()) {
			System.out.println(file.length());
		}else {
			//ファイルが存在しない場合
			try {
				//ファイルを作成
				file.createNewFile();
				//ファイルの絶対パス
				System.out.println(file.getAbsoluteFile());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		//フォルダの指定
		File dir = new File("test");
		//フォルダの作成
		dir.mkdir();
		//testフォルダの中にのhello.txtを指定
		File file2 = new File("test/hello.txt");
		try {
			//ファイルの作成
			file2.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
