//Написать программу — модель анализа пожарного датчика в помещении, которая выводит сообщение «Пожароопасная ситуация », если температура в комнате превысила 60° С.
package by.epam.jb29.task02;
import java.util.Scanner;

public class Z25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        final int TEMP = 60;

        if (a > TEMP) {
            System.out.println("Пожароопасная ситуация");
        }
    }
}
