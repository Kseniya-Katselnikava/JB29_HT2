//Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные.
package by.epam.jb29.task02;
import java.util.Scanner;

public class Z12 {
    public static void main(String[] args) {
        double a, b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число a");
        a = sc.nextDouble();
        System.out.println("Введите число b");
        b = sc.nextDouble();
        System.out.println("Введите число с");
        c = sc.nextDouble();

        if(a > 0) {
            a = (int)Math.pow(a, 2);
        } else {
            a = (int)Math.pow(a, 4);
        }
        if(b > 0) {
            b  = (int)Math.pow(b, 2);
        } else {
            b = (int)Math.pow(b, 4);
        }
        if(c > 0) {
            c = (int)Math.pow(c, 2);
        } else {
            c = (int)Math.pow(c, 4);
        }
        System.out.println("Значение а: " + a +
                "\nЗначение b: " + b +
                "\nЗначение с: " + c);
        }
    }

