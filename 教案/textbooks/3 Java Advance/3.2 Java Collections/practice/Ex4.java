import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex4 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student("Alice", 19, 110120),
                new Student("Bob", 21, 110121),
                new Student("Carol", 20, 110122),
                new Student("Dave", 19, 110123)
        ));
        System.out.println(students);
        students = students.stream().
                sorted((s1, s2) -> s1.getAge() - s2.getAge()).
                collect(Collectors.toList());
        System.out.println(students);
    }
}
