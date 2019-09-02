//Составить программу, определяющую результат гадания на ромашке — «любит—не любит», взяв за исходное данное количество лепестков п.
package by.epam.jb29.task02;
import java.util.Scanner;

public class Z24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int n = sc.nextInt();
        int count = 1;

        while (count != n + 1){
            if (count % 2 == 0) {
                System.out.println("Не любит");
            }
            else {
                System.out.println("Любит");
            }
            count++;
        }
    }
}
