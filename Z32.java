//Написать программу, которая по заданным трем числам определяет, является ли сумма каких-либо двух из них положительной.
package by.epam.jb29.task02;
import java.util.Scanner;

public class Z32 {
    public static void main(String[] args) {

        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        a = sc.nextInt();
        System.out.println("Enter b");
        b = sc.nextInt();
        System.out.println("Enter c");
        c = sc.nextInt();

        if (a + b > 0 || b + c > 0 || a + c > 0){
            System.out.println("Сумма предложенных чисел является положительной");
        }
        else {
            System.out.println("Сумма предложенных чисел является отрицательной");
        }
    }
}
