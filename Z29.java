//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой
package by.epam.jb29.task02;

import java.util.Scanner;

public class Z29 {
    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3;
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение x1: ");
        x1 = sc.nextDouble();
        System.out.println("Введите значение y1: ");
        y1 = sc.nextDouble();
        System.out.println("Введите значение x2: ");
        x2 = sc.nextDouble();
        System.out.println("Введите значение y2: ");
        y2 = sc.nextDouble();
        System.out.println("Введите значение x3: ");
        x3 = sc.nextDouble();
        System.out.println("Введите значение y3: ");
        y3 = sc.nextDouble();

        a = (y2 - y1) / (x2 - x1);
        b = y1 - a * x1;

        if ((x1 - x3) / (x2 - x3) == ((y1 - y3) / (y2 - y3))){
            System.out.println("Точки лежат на одной прямой");
        } else {
            System.out.println("Точки не лежат на одной прямой");
        }
    }
}
