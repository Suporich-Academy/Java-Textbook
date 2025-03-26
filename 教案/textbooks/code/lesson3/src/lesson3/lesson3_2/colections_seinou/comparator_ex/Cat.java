package lesson3.lesson3_2.colections_seinou.comparator_ex;

public class Cat {
	private String name;
    private double weight;

    public Cat(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	@Override
    public String toString() {
        return "Cat[" + name + ", weight: " + weight + "]";
    }
}