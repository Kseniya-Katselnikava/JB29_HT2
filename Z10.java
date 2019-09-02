//Составить программу, которая определит площадь какого круга меньше.
package by.epam.jb29.task02;
import java.util.Scanner;
import static java.lang.Math.PI;

public class Z10 {
    public static void main(String[] args) {
        double a, b, sca, scb;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус круга a");
        a = sc.nextDouble();
        System.out.println("Введите радиус круга b");
        b = sc.nextDouble();
        sca = PI * Math.pow(a, 2);
        scb = PI * Math.pow(b, 2);

        if (sca > scb) {
            System.out.println("Площадь кргуа b меньше");
        } else {
            System.out.println("Площадь кргуа a меньше");
        }
    }
}
