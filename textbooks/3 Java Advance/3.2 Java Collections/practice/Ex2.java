import java.util.HashMap;
import java.util.Map;

public class Ex2 {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();
        students.put("Alice", new Student("Alice", 19, 110120));
        students.put("Bob", new Student("Bob", 21, 110121));
        students.put("Carol", new Student("Carol", 20, 110122));
        students.put("Dave", new Student("Dave", 19, 110123));
        System.out.println(students);

        // 新入生を追加するテスト
        students.put("Zoe", new Student("Zoe", 22, 110124));
        System.out.println(students);

        // 学生情報を名前から取得するためのテスト
        System.out.println(students.get("Alice"));
    }
}
