//Подсчитать количество отрицательных среди чисел а, b, с.
package by.epam.jb29.task02;
import java.util.Scanner;

public class Z18 {
    public static void main(String[] args) {
        int a, b, c;
        int coun = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        a = sc.nextInt();
        System.out.println("Enter b");
        b = sc.nextInt();
        System.out.println("Enter c");
        c = sc.nextInt();

        if (a < 0) {
            coun++;
        }
        if (b < 0) {
            coun++;
        }
        if (c < 0) {
            coun++;
        }
        System.out.println(coun);
    }
}
