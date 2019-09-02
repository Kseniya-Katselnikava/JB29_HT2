//Составить программу, которая определит площадь какого треугольника больше.
package by.epam.jb29.task02;
import java.util.Scanner;

public class Z11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, a1, b1, c1, p1, p2, S1, S2;
        System.out.println("Введите сторону а первого треугольника");
        a = sc.nextDouble();
        System.out.println("Введите сторону b первого треугольника");
        b = sc.nextDouble();
        System.out.println("Введите сторону c первого треугольника");
        c = sc.nextDouble();
        System.out.println("Введите сторону а1 второго треугольника");
        a1 = sc.nextDouble();
        System.out.println("Введите сторону b1 второго треугольника");
        b1 = sc.nextDouble();
        System.out.println("Введите сторону c1 второго треугольника");
        c1 = sc.nextDouble();

        p1 = (a + b + c) / 2;
        p2 = (a1 + b1 + c1) / 2;
        S1 =  Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c));
        S2 =  Math.sqrt(p2 * (p2 - a1) * (p2 - b1) * (p2 - c1));

         if (S1 > S2) {
                System.out.println("Площадь первого треугольника больше площади второго треугольника");
         }
         else {
                System.out.println("Площадь второго треугольника больше площади первого треугольника");
        }
    }
}
