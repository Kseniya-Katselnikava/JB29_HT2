//Вычислить число и месяц в невисокосном году по номеру дня.
package by.epam.jb29.task02;
import java.util.Scanner;

public class Z35 {
    public static void main(String[] args) {
        int number, month, day;
        int m1 = 31, m2 = 30;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер дня");
        number = sc.nextInt();

        if (number <= 365) {
            if (number <= m1) {
                System.out.println(number + " января");
            } else if (number > m1 && number <= 59){
                day = number - m1;
                System.out.println(day + " февраля");
            } else {
                    month = number / m2;                    ;
//                System.out.println(month);
                    switch (month) {
                        case 2:
                            day = number - m1 - 28;
                                System.out.println(day + " марта");
                                break;
                        case 3:
                            if (number % m2 == 0){
                                day = number - m1 - 28;
                                System.out.println(day + " марта");
                            }
                            else {
                                day = number - (month * m2);
                                System.out.println(day + " апреля");
                            }
                            break;
                        case 4:
                            if (number % m2 == 0){
                                day = number -  m2 * month - 28;
                                System.out.println(day + " апреля");
                            }
                            else {
                                day = number - (month * m2);
                                System.out.println(day + " мая");
                            }
                            break;
                        case 5:
                            if ((number-1) % m2 == 0){
                                day = number -  m2 * (month - 1);
                                System.out.println(day + " мая");
                            }
                            else {
                                day = number-1 - (month * m2);
                                System.out.println(day + " июня");
                            }
                            break;
                        case 6:
                            if (number % m2 == 0 || (number-1) % m2 == 0){
                                day = number - 1 -  m2 * (month - 1);
                                System.out.println(day + " июня");
                            }
                            else {
                                day = number - 1 - m2 * month;
                                System.out.println(day + " июля");
                            }
                            break;
                        case 7:
                            if (number % m2 == 0 || (number-2) % m2 == 0 || (number-1) % m2 == 0){
                                day = number - 1 -  m2 * (month - 1);
                                System.out.println(day + " июня");
                            }
                            else {
                                day = number - 2 - (month * m2);
                                System.out.println(day + " августа");
                            }
                            break;
                        case 8:
                            if ((number-3) % m2 == 0 || (number-2) % m2 == 0 || (number-1) % m2 == 0 || number % m2 == 0){
                                day = number - 2 -  m2 * (month - 1);
                                System.out.println(day + " августа");
                            }
                            else {
                                day = number - 3 - (month * m2);
                                System.out.println(day + " сентября");
                            }
                            break;
                        case 9:
                            if ((number-3) % m2 == 0 || (number-2) % m2 == 0 || (number-1) % m2 == 0 || number % m2 == 0){
                                day = number - 3 -  m2 * (month - 1);
                                System.out.println(day + " сентября");
                            }
                            else {
                                day = number - 3 - (month * m2);
                                System.out.println(day + " октября");
                            }
                            break;
                        case 10:
                            if ((number-4) % m2 == 0 || (number-3) % m2 == 0 || (number-2) % m2 == 0 || (number-1) % m2 == 0 || number % m2 == 0){
                                day = number - 3 -  m2 * (month - 1);
                                System.out.println(day + " октября");
                            }
                            else {
                                day = number - 4 - (month * m2);
                                System.out.println(day + " ноября");
                            }
                            break;
                        case 11:
                            if ((number-4) % m2 == 0 || (number-3) % m2 == 0 || (number-2) % m2 == 0 || (number-1) % m2 == 0 || number % m2 == 0){
                                day = number - 4 -  m2 * (month - 1);
                                System.out.println(day + " ноября");
                            }
                            else {
                                day = number - 4 - (month * m2);
                                System.out.println(day + " декабря");
                            }
                            break;
                        case 12:
                            if ((number- 5) % m2 == 0 ||(number-4) % m2 == 0 || (number-3) % m2 == 0 || (number-2) % m2 == 0 || (number-1) % m2 == 0){
                                day = number - 4 -  m2 * (month - 1);
                                System.out.println(day + " декабря");
                            }
                            break;
                    }
                }
            } else {
            System.out.println("Значение не может быть больше 365");
            }
        }
    }


