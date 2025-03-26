package lesson2_4.enum_ex.ex1;

public enum Fruit {
	//定数を書く
	APPLE,ORANGE,CHERRY;

	public static void main(String[] arg) {
		switch(Fruit.APPLE) {
		case ORANGE:
			System.out.println(ORANGE +"is yummy");
		break;
		case APPLE:
			System.out.println(APPLE +"is yummy");
		break;
		case CHERRY:
			System.out.println(CHERRY +"is yummy");
		break;
		}


	}

}
