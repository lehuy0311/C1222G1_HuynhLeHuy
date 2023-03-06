package ss14_sort_algorithm;

import java.util.Arrays;

public class InsertionSortStepByStep {
    public static int[] insertionSort(int[] arr){
        int x;
        int key;
        for (int i = 0; i < arr.length; i++) {
            x = arr[i];
            key = i;
            while (key >0 && x < arr[key -1]){
                arr[key] = arr[key-1];
                key --;
            }
            arr[key] = x;
        }
        return arr;
        }

    public static void main(String[] args) {
        int[] array = {1, 8, 4, 44, -9, 0, 22, 99, 97};
        //System.out.println(insertionSort(array));
        System.out.println(Arrays.toString(insertionSort(array)));
    }
}
