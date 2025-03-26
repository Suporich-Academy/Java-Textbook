package lesson2_2.polymorphism;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}
	@Override
	void eat (String food) {
		System.out.println(name+"は"+food+"を食べる");
		bowwow();
	}

	void bowwow() {
		System.out.println("ワンワン");
	}

}
