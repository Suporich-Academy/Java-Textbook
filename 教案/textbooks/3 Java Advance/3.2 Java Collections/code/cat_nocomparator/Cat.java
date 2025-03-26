package cat_nocomparator;

public class Cat {
	private String name;
    private double weight;

    public Cat(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat[" + name + ", weight: " + weight + "]";
    }
}
