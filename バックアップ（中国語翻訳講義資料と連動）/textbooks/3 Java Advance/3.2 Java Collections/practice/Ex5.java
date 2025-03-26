public class Ex5 {
    private static class MyStack<T> {
        private Object[] arr;
        private int size;

        public MyStack() {
            arr = new Object[1000];
            size = 0;
        }

        public void push(T data) {
            arr[size++] = data;
        }

        public T pop() {
            return (T) arr[--size];
        }

        public int size() {
            return size;
        }
    }

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.size()); // => 3
        System.out.println(stack.pop()); // => 30
        stack.push(5);
        stack.push(7);
        System.out.println(stack.pop()); // => 7
        System.out.println(stack.pop()); // => 5
        System.out.println(stack.pop()); // => 20
        System.out.println(stack.size()); // => 1
    }
}
