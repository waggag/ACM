package cn.waggag.common;

/**
 * 冒泡排序实现
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {112,76,464,454,46,87,41,4,8};
        bubbleSort(arr);
        InsertSort.printArray(arr);
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
