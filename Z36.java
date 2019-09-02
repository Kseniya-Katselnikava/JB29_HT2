//Вычислить значение функции
package by.epam.jb29.task02;
import java.util.Scanner;

public class Z36 {
    public static void main(String[] args) {
        double f, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        x = sc.nextInt();

        if ((Math.pow(x, 3) + 6) != 0) {
            if (x <= 3) {
                f = Math.pow(x, 2) - 3 * x + 9;
                System.out.println(f);
            } else if (x > 3) {
                f = 1 / (Math.pow(x, 3) + 6);
                System.out.println(f);
            }
        }
        else {
            System.out.println("Ошибка. На ноль делить нельзя.");
        }
    }
}
