//Составить программу нахождения наименьшего из квадратов двух чисел а и b.

package by.epam.jb29.task02;
import java.util.Scanner;

public class Z8 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a");
        a = sc.nextInt();
        System.out.println("Введите b");
        b = sc.nextInt();

        if (Math.pow(a, 2) > Math.pow(b, 2)) {
            System.out.println("Наименьший квадрат числа b");
        } else {
            System.out.println("Наименьший квадрат числа a");
        }
    }
}
