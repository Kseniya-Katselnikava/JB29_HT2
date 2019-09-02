//Найти max{min(a, b), min(c, d)}.
package by.epam.jb29.task02;
import java.util.Scanner;

public class Z27 {
    public static void main(String[] args) {
        int a, b, c, d, min1, min2, max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        a = sc.nextInt();
        System.out.println("Enter b");
        b = sc.nextInt();
        System.out.println("Enter c");
        c = sc.nextInt();
        System.out.println("Enter d");
        d = sc.nextInt();

      if (a < b){
          min1 = a;
      }
      else {
          min1 = b;
      }
      if (c < d){
          min2 = c;
      }
      else {
          min2 = d;
      }
      if (min1 > min2){
          max = min1;
      }
      else {
          max = min2;
      }
//        System.out.println(min1 + " " + min2);
        System.out.println(max);
    }
}
