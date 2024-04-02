import java.util.Scanner;

public class Coco01_14 {
        public static void main(String[]args) {
            Scanner s = new Scanner(System.in);

            int a, b;
            int c, d, e, f;
            a = s.nextInt();
            b = s.nextInt();
            c = a * b;
            d = a + b;
            e = a - b;
            f = a / b;

            System.out.println(a + " * " + b + " = " + c);
            System.out.println(a + " + " + b + " = " + d);
            System.out.println(a+ " - " + b  + " = " + e);
            System.out.println(a+ " / " + b + " = " + f);
            s.close();


        }
    }