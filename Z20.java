//Определить, делителем каких чисел а, b, с является число k.
package by.epam.jb29.task02;
import java.util.Scanner;

public class Z20 {
    public static void main(String[] args) {
        double a, b, c, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        a = sc.nextDouble();
        System.out.println("Enter b");
        b = sc.nextDouble();
        System.out.println("Enter c");
        c = sc.nextDouble();
        System.out.println("Введите делитель k");
        k = sc.nextDouble();

        if (a % k == 0) {
            System.out.println("Число k: " + k + " является делителем числа а: " + a);
        }
        if (b % k == 0) {
            System.out.println("Число k: " + k + " является делителем числа b: " + b);
        }
        if (c % k == 0) {
            System.out.println("Число k: " + k + " является делителем числа c: " + a);
        }
    }
}
