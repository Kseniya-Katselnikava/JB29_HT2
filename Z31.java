//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.
package by.epam.jb29.task02;
import java.util.Scanner;

public class Z31 {
    public static void main(String[] args) {
        final int A = 15;
        final int B = 20;
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        x = sc.nextInt();
        System.out.println("Enter y");
        y = sc.nextInt();
        System.out.println("Enter z");
        z = sc.nextInt();

        if (x < A && y < B || x < A && z < B || y < A && z < B || x < B && y < A || x < B && z < A || y < B && z < A){
            System.out.println("Кирпич пройдет через отверстие");
        }
        else {
            System.out.println("Кирпич не пройдет через отверстие");
        }
    }
}
