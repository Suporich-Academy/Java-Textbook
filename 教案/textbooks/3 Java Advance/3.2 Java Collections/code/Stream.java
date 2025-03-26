import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Bob", "Alice", "Carol", "Alice", "Dave"));
        System.out.println(names); // => [Bob, Alice, Carol, Alice, Dave]
        System.out.println(names.stream().
                distinct().
                filter(name -> name.length() > 3).
                sorted().
                collect(Collectors.toList())
        ); // => [Alice, Carol, Dave]
    }
}