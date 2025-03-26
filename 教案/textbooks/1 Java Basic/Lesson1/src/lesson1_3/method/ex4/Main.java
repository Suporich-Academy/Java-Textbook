package lesson1_3.method.ex4;

public class Main {

	public static void main(String[] args) {
		int calculationResult = calculatingChange(1000,1200);
		System.out.println("お釣りは"+calculationResult+"円です");
		//お釣りは200円です
	}

	static int calculatingChange(int totalAmount,int payment) {
		int change = payment-totalAmount;
		return change;
	}
}
