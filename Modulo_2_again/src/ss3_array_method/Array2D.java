package ss3_array_method;

public class Array2D {
    public static void main(String[] args) {
        int[][] arr = {{21, 34}, {45, 67, 84}, {9, 10, 12, 15}, {4}};
        int result = average(arr);
        System.out.println("Trung bình cộng của các số chẵn trong mảng 2 chiều là: " + result);
    }

    public static int average(int[][] array) {
        int sum = 0;
        int average = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    sum = sum + array[i][j];
                    count = count + 1;
                }
            }
        }
        average = sum / count;
        return average;
    }
}
