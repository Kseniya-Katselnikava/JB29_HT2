//Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не равно d, то найти max(d — a, d — b, d —c).
package by.epam.jb29.task02;
import java.util.Scanner;

public class Z28 {
    public static void main(String[] args) {
        int d = 25;
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        a = sc.nextInt();
        System.out.println("Enter b");
        b = sc.nextInt();
        System.out.println("Enter c");
        c = sc.nextInt();

        if (a == d){
            System.out.println("Число а равно d");
        }
        else if (b == d){
            System.out.println("Число b равно d");
        }
        else if (c == d){
            System.out.println("Число c равно d");
        }
        else {
            int [] arr = new int[3];
            arr[0] = d - a;
            arr[1] = d - b;
            arr[2] = d - c;
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("Максимальное значение равно " + max);
        }
    }
}
