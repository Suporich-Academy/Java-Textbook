package lesson3.lesson3_1.bubble_sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {3, 2, 8, 9, 12, 5, 1};

        bubbleSort(array);//配列を並び替える
        printArray(array);//並び替えた配列を表示させる
    }

//n-i-1 は、まだソートされていない部分の最後の要素のインデックスを表します。
    //n-i-1 は、まだソートされていない部分の最後の要素のインデックスを表します。各パスの終わりに最大値が確定するため、
    //それ以降は比較の対象になりません。各パスの終わりに最大値が確定するため、それ以降は比較の対象になりません。
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {//7-0-1 = 6 5
                if (arr[j] > arr[j+1]) {
                    // スワップ
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
//
// for (int i = 0; i < n-1; i++) {
//for (int j = 0; j < n-i-1; j++)
/*i	j	arr[j]	arr[j+1]	交換の有無	配列の状態
0	0	3	     2			    Yes	{2, 3, 8, 9, 12, 5, 1}
0	1	3	     8				No	{2, 3, 8, 9, 12, 5, 1}
0	2	8	     9				No	{2, 3, 8, 9, 12, 5, 1}
0	3	9	     12				No	{2, 3, 8, 9, 12, 5, 1}
0	4	12		 5				Yes	{2, 3, 8, 9, 5, 12, 1}
0	5	12		 1				Yes	{2, 3, 8, 9, 5, 1, 12}
1	0	2		 3				No	{2, 3, 8, 9, 5, 1, 12}
1	1	3		 8				No	{2, 3, 8, 9, 5, 1, 12}
1	2	8		 9				No	{2, 3, 8, 9, 5, 1, 12}
1	3	9		 5				Yes	{2, 3, 8, 5, 9, 1, 12}
1	4	9		 1				Yes	{2, 3, 8, 5, 1, 9, 12}
2	0	2		 3				No	{2, 3, 8, 5, 1, 9, 12}
2	1	3	 	 8				No	{2, 3, 8, 5, 1, 9, 12}
2	2	8		 5				Yes	{2, 3, 5, 8, 1, 9, 12}
2	3	8		 1				Yes	{2, 3, 5, 1, 8, 9, 12}
3	0	2		 3				No	{2, 3, 5, 1, 8, 9, 12}
3	1	3		 5				No	{2, 3, 5, 1, 8, 9, 12}
3	2	5		 1				Yes	{2, 3, 1, 5, 8, 9, 12}
4	0	2		 3				No	{2, 3, 1, 5, 8, 9, 12}
4	1	3		 1				Yes	{2, 1, 3, 5, 8, 9, 12}
5	0	1		 2				No	{1, 2, 3, 5, 8, 9, 12}
5	1	2		 3				No	{1, 2, 3, 5, 8, 9, 12}
6	0	1		 2				No	{1, 2, 3, 5, 8, 9, 12}*/