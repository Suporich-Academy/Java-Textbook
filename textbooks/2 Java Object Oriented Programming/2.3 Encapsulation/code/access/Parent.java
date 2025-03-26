package access;

public class Parent {
    public int a;
    protected int b;
    int c;
    private int d;

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.a = 0;
        parent.b = 0;
        parent.c = 0;
        parent.d = 0;
    }
}
