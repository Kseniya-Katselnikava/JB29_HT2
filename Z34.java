//Составить программу, реализующую эпизод применения компьютера в книжном магазине. Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем; если сдачи не требуется,
//печатает на экране «спасибо»; если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; если денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.
package by.epam.jb29.task02;
import java.util.Scanner;

public class Z34 {
    public static void main(String[] args) {
        int price, count, cost, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Внесите стоиомсть книги");
        price = sc.nextInt();
        System.out.println("Внесите количество книг");
        count = sc.nextInt();
        cost = price * count;
        System.out.println("Итоговая стоимость книг равна: " + cost + " руб.");
        System.out.println("Введите сумму денег, внесенную покупателем");
        sum = sc.nextInt();

        if (sum == cost){
            System.out.println("Спасибо");
        }
        else if (sum > cost){
            System.out.println("Возьмите сдачу: " + (sum - cost) + " руб.");
        }
        else if (sum < cost){
            System.out.println("Денег недостаточно. Размер недостающей суммы: " + (cost - sum) + " руб.");
        }
    }
}
