//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
package by.epam.jb29.task02;
import java.util.Scanner;

public class Z14 {
    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите угол a в градусах:");
        a = sc.nextDouble();
        System.out.println("Введите угол b в градусах:");
        b = sc.nextDouble();

        if (a + b < 180 && a > 0 && b > 0) {
            System.out.println("Такой треугольник существует");
            if (a == 90 || b == 90 || a + b == 90) {
                System.out.println("Треугольник прямоугольный");
            }
            else {
                System.out.println("Треугольник не прямоугольный");
            }
        } else {
            System.out.println("Такого треугольника не существует");
        }
    }
}
