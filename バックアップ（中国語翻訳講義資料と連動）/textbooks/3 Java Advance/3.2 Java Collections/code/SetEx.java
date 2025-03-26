import java.util.HashSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set<String> studentNames = new HashSet<String>();
        studentNames.add("Alice");
        studentNames.add("Bob");
        studentNames.add("Carol");
        System.out.println(studentNames); // => [Bob, Alice, Carol]
        studentNames.remove("Alice");
        System.out.println(studentNames); // => [Bob, Carol]
        System.out.println(studentNames.contains("Alice")); // => false
    }
}