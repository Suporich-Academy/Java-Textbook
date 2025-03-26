import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        Map<String, Integer> studentAges = new HashMap<String, Integer>();
        studentAges.put("Alice", 9);
        studentAges.put("Bob", 10);
        studentAges.put("Carol", 10);
        System.out.println(studentAges.get("Alice")); // => 9
        System.out.println(studentAges); // => {Bob=10, Alice=9, Carol=10}
        studentAges.put("Alice", 8);
        System.out.println(studentAges.get("Alice")); // => 8
        System.out.println(studentAges); // => {Bob=10, Alice=8, Carol=10}
    }
}