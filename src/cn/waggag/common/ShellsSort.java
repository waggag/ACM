package cn.waggag.common;

public class ShellsSort {

    public static void main(String[] args) {
        int[] arr = {10,485,4,45,15,15,561,16};
        ShellSort(arr);
        InsertSort.printArray(arr);
    }

    public static void ShellSort(int[] array){
        int d = array.length/2;
        while(d > 0){
            for(int i = d;i < array.length;i++){

                int j = i - d;
                while(j >= 0 && array[j] > array[j+d] ){
                    int temp = array[j];
                    array[j] = array[j+d];
                    array[j+d] = temp;
                }
            }
            d = d / 2;
        }
    }
}
