package lesson2_4.abstract_class.ex2;

public class Cat extends Animal{
	public Cat(String name) {
		super(name);
	}

	@Override
	public void eat(String food) {
		System.out.println(name+" ate "+food );
	}

	@Override
	protected void sleep() {
		System.out.println(name+" sleep ");

	}
}