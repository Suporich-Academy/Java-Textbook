import java.util.List;
import java.util.Optional;

public class OptionalTest {
    static Optional<List<String>> getList(boolean isNull) {
        return Optional.ofNullable(isNull ? null : List.of("a", "b", "c"));
    }

    public static void main(String[] args) {
        Optional<List<String>> list1 = getList(false);

        // リストが null でない場合は、リストが出力され、null である場合は、空のリストが出力される
        System.out.println(list1.orElse(List.of()));

        // リストが null でない場合、リストのサイズが出力される
        list1.ifPresent(l -> {
            System.out.println(l.size());
        });

        System.out.println("-----");

        Optional<List<String>> list2 = getList(true);

        // リストが null でない場合は、リストが出力され、null である場合は、空のリストが出力される
        System.out.println(list2.orElse(List.of()));

        // リストが null でない場合、リストのサイズが出力される
        list2.ifPresent(l -> {
            System.out.println(l.size());
        });
    }
}
