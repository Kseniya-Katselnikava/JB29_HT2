//Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12). Если введены некорректные данные, то сообщить об этом.
package by.epam.jb29.task02;
import java.util.Scanner;

public class Z23 {
    public static void main(String[] args) {
        int day, month, year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год");
        year = sc.nextInt();
        System.out.println("Введите месяц");
        month = sc.nextInt();
        System.out.println("Введите число");
        day = sc.nextInt();

        if (month >= 1 && month <= 12 && day >=1 && day <= 31) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (day >= 1 && day <= 31) {
                        System.out.println("Дата введена верно");
                    } else {
                        System.out.println("День введен неверно");
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day >= 1 && day <= 30) {
                        System.out.println("Дата введена верно");
                    } else {
                        System.out.println("День введен неверно");
                    }
                    break;
                case 2:
                    if (year % 4 == 0 /*&& year % 100 == 0*/){ // это под вопрососм!!!
                        if (day >= 1 && day <= 29) {
                            System.out.println("Дата введена верно");
                        } else {
                            System.out.println("День введен неверно");
                        }
                    }
                    else {
                        if (day >= 1 && day <= 28) {
                            System.out.println("Дата введена верно");
                        } else {
                            System.out.println("День введен неверно");
                        }
                    }
            }
        }
        else{
            System.out.println("Месяц введен неверно");
        }
    }
}
