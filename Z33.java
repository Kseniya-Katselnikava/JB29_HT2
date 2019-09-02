//Написать программу, которая по паролю будет определять уровень доступа сотрудника к секретной информации в базе данных.
//Доступ к базе имеют только шесть человек, разбитых на три группы по степени доступа. Они имеют следующие пароли: 9583, 1747 —
//доступны модули баз А, В, С; 3331, 7922 — доступны модули баз В, С; 9455, 8997 — доступен модуль базы С.
package by.epam.jb29.task02;
import java.util.Scanner;

public class Z33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password");
        int a = sc.nextInt();

        if (a == 9583 || a == 1747){
            System.out.println("Вам доступны модули баз А, В, С");
        }
        else if (a == 3331 || a == 7922){
            System.out.println("Вам доступны модули баз В, С");
        }
        else if (a == 9455 || a == 8997){
            System.out.println("Вам доступен модуль базы С");
        }
        else {
            System.out.println("У вас нет доступа к модулям баз");
        }
    }
}
