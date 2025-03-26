import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student("Alice", 19, 110120),
                new Student("Bob", 21, 110121),
                new Student("Carol", 20, 110122),
                new Student("Dave", 19, 110123)
        ));
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
