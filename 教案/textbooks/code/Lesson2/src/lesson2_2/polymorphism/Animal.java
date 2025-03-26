package lesson2_2.polymorphism;

public class Animal {
	String name;

	public Animal(String name) {
		this.name = name;
	}

	void eat(String food) {
		System.out.println(food + "を食べる");
	}

}
