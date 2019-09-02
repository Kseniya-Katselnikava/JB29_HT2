//Составить программу: определения наименьшего из двух чисел а и b.
package by.epam.jb29.task02;
import java.util.Scanner;

public class Z5 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a");
        a = sc.nextInt();
        System.out.println("Введите b");
        b = sc.nextInt();

        if (a > b){
            System.out.println("Наименьшее число a");
        }
        else {
            System.out.println("Наименьшее число b");
        }
    }
}
