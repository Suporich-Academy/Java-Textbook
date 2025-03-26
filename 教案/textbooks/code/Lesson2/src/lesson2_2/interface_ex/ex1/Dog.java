package lesson2_2.interface_ex.ex1;

public class Dog implements Life {
    @Override
    public void cry() {
        System.out.println("ワン");
    }
}
