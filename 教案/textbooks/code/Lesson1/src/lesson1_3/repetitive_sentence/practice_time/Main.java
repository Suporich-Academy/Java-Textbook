package lesson1_3.repetitive_sentence.practice_time;

public class Main {

	public static void main(String[] args) {
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		System.out.println("-------for文-------");
		for (int i = 0; i < cars.length; i++) {
			System.out.println("cars[" + i + "]の値は" + cars[i]);
		}
		System.out.println("-------while文-------");
		int a = 0;
		while (a < cars.length) {
			System.out.println("cars[" + a + "]の値は" + cars[a]);
			a++;
		}
		System.out.println("-------do-while文-------");
		int b = 0;
		do {
			System.out.println("cars[" + b + "]の値は" + cars[b]);
			b++;
		} while (b < cars.length);
	}

}
