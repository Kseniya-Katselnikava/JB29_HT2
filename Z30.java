//Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если это не так.
package by.epam.jb29.task02;
import java.util.Scanner;

public class Z30 {
    public static void main(String[] args) {
        double a, b, c, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        a = sc.nextDouble();
        System.out.println("Enter b");
        b = sc.nextDouble();
        System.out.println("Enter c");
        c = sc.nextDouble();

        if (a > b && b > c){
            a = 2 * a;
            b = 2 * b;
            c = 2 * c;
        }
        else {
            a = Math.abs(a);
            b = Math.abs(b);
            c = Math.abs(c);
        }
        System.out.println("a = " + a + "; b = " + b + "; c = " + c);
    }
}
