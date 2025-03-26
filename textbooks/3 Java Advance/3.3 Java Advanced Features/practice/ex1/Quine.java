package ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Quine {
    public static void main(String[] args) {
        File file = new File("src/ex1/Quine.java");

        try (
              FileReader fileReader = new FileReader(file);
              BufferedReader reader = new BufferedReader(fileReader)
        ) {
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
