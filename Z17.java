//Даны целые числа т, п. Если числа не равны, то заменить каждое из них одним и тем же числом, равным большему из исходных, а если равны, то заменить числа нулями.
package by.epam.jb29.task02;
import java.util.Scanner;

public class Z17 {
    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();

        if (m != n) {
            if (m < n) {
                m = n;
            }
            else {
                n = m;
            }
        }
        else {
            m = 0;
            n = 0;
        }
        System.out.println("m = " + m + "; n = " + n);
    }
}
