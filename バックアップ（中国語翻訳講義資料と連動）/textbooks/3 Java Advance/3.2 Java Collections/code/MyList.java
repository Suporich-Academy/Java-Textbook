public class MyList<T> {
    private Object[] arr;
    private int n;

    public MyList() {
        arr = new Object[1000];
        n = 0;
    }

    public T get(int index) {
        return (T) arr[index];
    }

    public void add(T item) {
        arr[n++] = item;
    }

    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list.get(0)); // => a
        System.out.println(list.get(1)); // => b
        System.out.println(list.get(2)); // => c

        System.out.println("------");

        MyList<Integer> list2 = new MyList<>();
        list2.add(10);
        list2.add(20);
        System.out.println(list2.get(0)); // => 10
        System.out.println(list2.get(1)); // => 20
    }
}