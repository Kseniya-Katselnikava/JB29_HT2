//Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух чисел заменить половиной их суммы, а большее — их удвоенным произведением.
package by.epam.jb29.task02;
import java.util.Scanner;

public class Z15 {
    public static void main(String[] args) {
        double x, y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x != y) {
            if (x < y) {
                x = (x + y) / 2;
                y = x * y * 2;
            }
            else {
                y = (x + y) / 2;
                x = x * y * 2;
            }
            System.out.println("x: " + x + "; y: " + y);
        }
    }
}
