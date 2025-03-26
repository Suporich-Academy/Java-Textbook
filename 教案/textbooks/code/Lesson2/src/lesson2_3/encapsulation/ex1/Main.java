package lesson2_3.encapsulation.ex1;

public class Main {

	public static void main(String[] args) {
		Bank acc = new Bank();

		acc.setName("田中太郎");
		acc.setBalance(1000000);
		acc.showAccount();
		// 口座名義：田中太郎
		// 口座残高：1000000円

	}

}
