package lesson2_2.polymorphism;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	@Override
	void eat (String food) {
		System.out.println(name+"は"+food+"を食べる");
		mewo();
	}

	void mewo() {
		System.out.println("ニャーニャー");
	}

}
