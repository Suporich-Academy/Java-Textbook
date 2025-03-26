package lesson3.lesson3_3.scanner_ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
          System.out.println("Please enter your name");
          String name = scanner.nextLine();
          System.out.println("Please enter your age");
          int age = scanner.nextInt();
          System.out.println("Your name is" + name +" and your age is "+age);
		}catch(InputMismatchException e) {
			e.printStackTrace();
		}
	}

}
