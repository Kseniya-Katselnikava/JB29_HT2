//На плоскости ХОY задана своими координатами точка А. Указать, где она расположена (на какой оси или в каком координатном угле).
package by.epam.jb29.task02;
import java.util.Scanner;

public class Z16 {
    public static void main(String[] args) {
        double x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        x = sc.nextDouble();
        System.out.println("Enter y");
        y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Точка А - начало координат");
        } else {
            if (x >= 0 && y >= 0) {
                if (x > 0 && y == 0) {
                    System.out.println("Точка А находится на оси Х в I, IV координатном углах");
                } else if (x == 0 && y > 0) {
                    System.out.println("Точка А находится на оси Y в I, II координатном углах");
                } else {
                    System.out.println("Точка А находится в I координатном угле");
                }
            } else if (x >= 0 && y < 0) {
                if (x == 0 && y < 0) {
                    System.out.println("Точка А находится на оси Y в III, IV координатном углах");
                } else {
                    System.out.println("Точка А находится в IV координатном угле");
                }
            } else if (x <= 0 && y < 0) {
                if (x == 0 && y < 0) {
                    System.out.println("Точка А находится на оси Y в II, III координатном углах");
                } else {
                    System.out.println("Точка А находится в III координатном угле");
                }
            }
            else if (x < 0 && y > 0) {
                    System.out.println("Точка А находится в II координатном угле");
                }
            }
        }
    }

