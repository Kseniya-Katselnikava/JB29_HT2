//Составить программу сравнения введенного числа а и цифры 3. Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести слово «no».
package by.epam.jb29.task02;
import java.util.Scanner;

public class Z3 {
    public static void main(String[] args) {
        int a, b = 3;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if (a < b) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
