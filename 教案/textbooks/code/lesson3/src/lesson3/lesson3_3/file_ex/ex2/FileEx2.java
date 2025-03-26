package lesson3.lesson3_3.file_ex.ex2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileEx2 {
	public static void main(String[] args) {
		//ファイルクラスを使ってファイルを指定
		File file = new File("practice2.txt");

		//ファイルを作成
		//もしファイルが存在していない場合にはファイルを作成して
		//存在して以内場合には、ファイルのサイズを出力する
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println(file.length());
		}
		//ファイルの書き込み操作
		//try-with-resource
		try(
				FileWriter fileWriter = new FileWriter(file);
				BufferedWriter writer = new BufferedWriter(fileWriter);
				){
			//文字列をファイルに書き込む操作
			writer.write("Line 1");
			//改行
			writer.newLine();
			writer.write("Line 2");
			writer.newLine();
			writer.write("Line 3");

		}catch(FileNotFoundException e) {
			System.out.println("Can not open file");
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("Can not write file");
		}

		//ファイルを読み込んでファイルの内容をコンソールに出力する
		try(
				FileReader fileReader = new FileReader(file);
				BufferedReader reader = new BufferedReader(fileReader);
		){
			//System.out.println(reader.lines().toList());
			//1行ずつ書いた内容を改行の状態でコンソールに出力する
			String line = reader.readLine();
			while(line!=null) {
				//内容を出力
				System.out.println(line);
				line = reader.readLine();
			}

		}catch(FileNotFoundException e) {
			System.out.println("Can not open file");
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("Can not read file");
		}

	}
}
