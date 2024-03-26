import java.util.Scanner;

public class exam03 {
    public static void main (String[]args) {
        Scanner s = new Scanner(System.in);

        int num1;
        int num2;
        int result;

        num1 = s.nextInt();
        num2 = s.nextInt();
        result = num1 * num2;

        System.out.println(num1 + " * " + num2 + " = " + result);

        s.close();

    }
    }