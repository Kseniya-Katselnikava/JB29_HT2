//Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран цифру 7, в противном случае – цифру 8.

package by.epam.jb29.task02;
import java.util.Scanner;


public class Z1 {
    public static void main(String[] args) {
        int a = 2, b = 1;

        if (a < b) {
            System.out.println(7);
        }
        else {
            System.out.println(8);
        }
    }
}

