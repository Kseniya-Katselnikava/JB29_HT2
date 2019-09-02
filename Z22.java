//Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее.
package by.epam.jb29.task02;
import java.util.Scanner;

public class Z22 {
    public static void main(String[] args) {
        int x, y, buf;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        if (x < y){
            buf = x;
            x = y;
            y = buf;
        }
        System.out.println("x = " + x + "; y = " + y);
    }
}
