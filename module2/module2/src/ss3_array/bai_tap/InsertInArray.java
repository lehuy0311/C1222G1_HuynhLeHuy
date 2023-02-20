package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertInArray {
    public static void main(String[] args) {
        int[] array = {10,4,6,7,8,0,0,0,0,0};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number that you want to insert: ");
        int number = input.nextInt();
        int index;
        do {
            System.out.println("Enter position that you want to insert: ");
            index = input.nextInt();
            if (index<0||index>9){
                System.out.println("Not insert to the array");
            }
        } while (index<0||index>9);

        for (int i=array.length-1; i>index; i--){
            array[i]=array[i-1];
        }
        array[index]=number;
        System.out.println(Arrays.toString(array));

//        for (int i: array){
//            System.out.println(i);
//        }
    }
}
