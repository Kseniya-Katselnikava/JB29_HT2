//Вычислить значение функции
package by.epam.jb29.task02;
import java.util.Scanner;

public class Z38 {
    public static void main(String[] args) {
        double f, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        x = sc.nextInt();

             if (x >= 0 && x <= 3) {
                f = Math.pow(x, 2);
                System.out.println(f);
            } else if (x > 3 || x < 0) {
                 f = 4;
               System.out.println(f);
            }
    }
}
