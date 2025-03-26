import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String> studentNames = new LinkedList<String>();
        studentNames.offer("Alice");
        studentNames.offer("Bob");
        studentNames.offer("Carol");
        System.out.println(studentNames.poll()); // => Alice
        System.out.println(studentNames.size()); // => 2
        System.out.println(studentNames.peek()); // => Bob
        System.out.println(studentNames.size()); // => 2
    }
}