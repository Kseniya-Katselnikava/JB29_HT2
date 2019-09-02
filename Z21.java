//Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М». В зависимости от
// ответа на экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся мальчики!».
package by.epam.jb29.task02;
import java.util.Scanner;

public class Z21 {
    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Кто тыЖ мальчи илидевочка? Введи Д или М");
        input = sc.nextLine();
        char inp = input.charAt(0);

        switch (inp) {
            case 'Д':
                System.out.println("Мне нравятся девочки!");
                break;
            case 'М':
                System.out.println("Мне нравятся мальчики!");
                break;
        }
    }
}
