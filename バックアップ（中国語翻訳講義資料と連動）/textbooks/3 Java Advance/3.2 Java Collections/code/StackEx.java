import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<String> studentNames = new Stack<String>();
        studentNames.push("Alice");
        studentNames.push("Bob");
        studentNames.push("Carol");
        System.out.println(studentNames.pop()); // => Carol
        System.out.println(studentNames.size()); // => 2
        System.out.println(studentNames.peek()); // => Bob
        System.out.println(studentNames.size()); // => 2
    }
}