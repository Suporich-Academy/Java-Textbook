public class Cat {
    String name;
    int age;

    Cat(String name_, int age_) {
        name = name_;
        age = age_;
    }

    @Override
    public String toString() {
        return "I'm a cat named " + name + ". I'm " + age + " years old.";
    }

    public static void main(String[] args) {
        Cat tom = new Cat("Tom", 3);
        System.out.println(tom); // => I'm a cat named Tom. I'm 3 years old.
    }
}
