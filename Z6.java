//Составить программу: определения наибольшего из двух чисел а и b.
package by.epam.jb29.task02;
import java.util.Scanner;

public class Z6 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a");
        a = sc.nextInt();
        System.out.println("Введите b");
        b = sc.nextInt();

        if (a > b) {
            System.out.println("Наибольшее число a");
        } else {
            System.out.println("Наибольшее число b");
        }
    }
}
