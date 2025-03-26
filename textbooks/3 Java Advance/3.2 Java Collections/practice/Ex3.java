import java.util.HashMap;
import java.util.Map;

public class Ex3 {
    static char mostFrequentChar(char[] arr) {
        Map<Character, Integer> times = new HashMap<>();

        // 各文字の出現回数を数える
        for (char c : arr) {
            if (times.containsKey(c)) {
                times.put(c, times.get(c) + 1);
            } else {
                times.put(c, 1);
            }
        }

        // 出現回数が一番多い文字を探す
        char ans = 0;
        int maxTime = 0;
        for (char c : times.keySet()) {
            if (times.get(c) > maxTime) {
                maxTime = times.get(c);
                ans = c;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(mostFrequentChar(new char[] {'a', 'b', 'b'})); // => b
        System.out.println(mostFrequentChar(new char[] {'a', 'b', 'c', 'a'})); // => a
    }
}
