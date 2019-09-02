//Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник равносторонним.
package by.epam.jb29.task02;
import java.util.Scanner;

public class Z9 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сторону a");
        a = sc.nextInt();
        System.out.println("Введите сторону b");
        b = sc.nextInt();
        System.out.println("Введите сторону с");
        c = sc.nextInt();

        if (a == b && b == c && a == c) {
            System.out.println("Треугольник является равносторонним");
        } else {
            System.out.println("Треугольник не является равносторонним");
        }
    }
}

