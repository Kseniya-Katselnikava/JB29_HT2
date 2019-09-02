//Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится ближе к началу координат.
package by.epam.jb29.task02;
import java.util.Scanner;

public class Z13 {
    public static void main(String[] args) {
        int x1, y1, x2, y2;
        double size1, size2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение x1");
        x1 = sc.nextInt();
        System.out.println("Введите начение y1");
        y1 = sc.nextInt();
        System.out.println("Введите значение x2");
        x2 = sc.nextInt();
        System.out.println("Введите значение y2");
        y2 = sc.nextInt();

        size1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        size2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));

        if (size1 < size2) {
            System.out.println("Точка а находится ближе ");
        }
        else {
            System.out.println("Точка b находится ближе ");
        }
    }
}

