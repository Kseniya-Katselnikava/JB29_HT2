//Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х
package by.epam.jb29.task02;
import java.util.Scanner;

public class Z7 {
    public static void main(String[] args) {
        int a, b, c, x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        a = sc.nextInt();
        System.out.println("Enter b");
        b = sc.nextInt();
        System.out.println("Enter c");
        c = sc.nextInt();
        System.out.println("Enter x");
        x = sc.nextInt();

        y = a * x * x + b * x + c;

        if (y > 0) {
            System.out.println("y равен: " + y);
        } else if (y < 0) {
            y = (int)Math.abs(y);
            System.out.println("y равен: " + y);
        } else {
            System.out.println("y равен нулю.");
        }
    }
}
