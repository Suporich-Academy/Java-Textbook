public class DynamicString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char c = 'a'; c <= 'z'; c++) {
            sb.append(c);
        }
        String str = sb.reverse().toString();
        System.out.println(str);
    }
}
