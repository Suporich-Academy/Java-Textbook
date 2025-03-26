public class Switch {

	public static void main(String[] args) {
		int fortune = 2;

		// スイッチ文
		switch (fortune) {
		case 1:
			System.out.println("大吉");
			break;
		case 2:
			System.out.println("中吉");
			break;
		default:
			System.out.println("凶");
		}

	}

}
