package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChangeNumberToChar {
    final static String ones[] = {" ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN"};
    final static String twos[] = {" ", " ", " TWENTY", " THIRTY", " FORTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};

    public static void numberToWord(int num, String value) {
//        System.out.print(num > 19 ? twos[num / 10] + " " + ones[num % 10]  : ones[num]);
//        System.out.print(num > 0 ? value : "");
        if (num > 19) {
            System.out.println(twos[num / 10] + ones[num % 10]);
        } else
            System.out.println(ones[num]);

        if (num > 0) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        System.out.print("Input a number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
//        numberToWord(((num / 100) % 10), " HUNDRED AND");
//        numberToWord((num % 100), " ");
        if (num <= 19) {
            System.out.println(ones[num]);
        } else if (num > 19 && num < 100) {
            System.out.println(twos[num / 10] + ones[num % 10]);
        } else if (num >= 100 && num % 100 == 0) {
            System.out.println(ones[(num / 100) % 10] + " HUNDRED");
        } else if (num > 100) {
            System.out.print(ones[(num / 100) % 10] + " HUNDRED AND");
            numberToWord(num % 100, " ");
        }
    }
}
