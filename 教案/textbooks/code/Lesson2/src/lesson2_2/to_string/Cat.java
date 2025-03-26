package lesson2_2.to_string;

public class Cat {

	String name;
	int age;

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}

}
