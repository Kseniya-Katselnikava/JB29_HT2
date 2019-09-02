//Вычислить значение функции
package by.epam.jb29.task02;
import java.util.Scanner;

public class Z40 {
    public static void main(String[] args) {
        double f, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        x = sc.nextInt();

        if ((x + 1) != 0) {
            if (x <= 13) {
                f = 1 * Math.pow(x, 3) + 9;
                System.out.println(f);
            } else if (x > 13) {
                f = -1 * (1 / x + 1);
                System.out.println(f);
            }
        }
        else {
            System.out.println("Ошибка. На ноль делить нельзя.");
        }
    }
}
