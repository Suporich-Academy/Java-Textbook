import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List<String> studentNames = new ArrayList<String>();
        studentNames.add("Alice");
        studentNames.add("Bob");
        studentNames.add("Carol");
        System.out.println(studentNames); // => [Alice, Bob, Carol]
        studentNames.remove("Alice");
        System.out.println(studentNames); // => [Bob, Carol]

        List<Integer> nums = List.of(1, 2, 4, 8);
        System.out.println(nums); // => [1, 2, 4, 8]
//        nums.remove(0); // エラー：nums は immutable である
        List<Integer> nums2 = new ArrayList<>(List.of(1, 2, 4, 8));
        nums2.remove(0);
        System.out.println(nums2); // => [2, 4, 8]

        // 4 6 10
        for (int i : nums2) {
            System.out.println(i + 2);
        }
    }
}