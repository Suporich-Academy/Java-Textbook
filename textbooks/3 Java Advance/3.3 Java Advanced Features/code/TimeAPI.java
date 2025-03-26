import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TimeAPI {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.of(1900, 4, 12, 0, 0);

        System.out.println(date); // => 1900-04-12T00:00
        System.out.println(date.getDayOfWeek()); // => THURSDAY

        date = date.plusDays(1000);

        System.out.println(date); // => 1903-01-07T00:00

        // 今日の日付を取得する
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // 1900/4/12 から今日までの日数を計算する
        System.out.println(date.until(now, ChronoUnit.DAYS));
    }
}
