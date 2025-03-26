public class BinarySearch {
    /**
     * 線形探索法。
     * @param data 探索される配列
     * @param val 探索したい目標値
     * @return 配列中にあるデータのインデックス。データが配列中に存在しない場合、-1 を返す
     */
    public static int linearSearch(int[] data, int val) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(".");
            if (data[i] == val) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 二分探索法。
     * @param data 探索される配列
     * @param val 探索したい目標値
     * @return 配列中にあるデータのインデックス。データが配列中に存在しない場合、-1 を返す
     */
    public static int binarySearch(int[] data, int val) {
        return binarySearch(data, val, 0, data.length);
    }

    private static int binarySearch(int[] data, int val, int start, int end) {
        if (start == end) { // 探索される範囲の長さが 0 の場合、データは絶対にない
            return -1;
        }

        int middle = (start + end) / 2;

        System.out.print(".");
        if (val == data[middle]) { // 配列の中央がデータに一致する場合、データは見つけた。中央のインデックスを返す
            return middle;
        } else if (val < data[middle]) { // 中央のデータより小さい場合、左を探索
            return binarySearch(data, val, start, middle);
        } else { // 中央のデータより大きい場合、右を探索
            return binarySearch(data, val, middle + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] data = {1, 3, 4, 7, 9, 10, 15, 19, 20, 24, 30}; // データは小さいものから順に並べる
        System.out.println(linearSearch(data, 20)); // => .........8
        System.out.println(linearSearch(data, 5)); // => ...........-1
        System.out.println(binarySearch(data, 20)); // => ..8
        System.out.println(binarySearch(data, 5)); // => ....-1
    }
}
