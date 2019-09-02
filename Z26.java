//Написать программу нахождения суммы большего и меньшего из трех чисел.
package by.epam.jb29.task02;
import java.util.Scanner;

public class Z26 {
    public static void main(String[] args) {
        int a, b, c, sum, min, max = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int [] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        min = a;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(min + " " + max);
        sum = min + max;
        System.out.println(sum);

    }
}
