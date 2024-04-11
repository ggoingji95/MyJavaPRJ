import java.util.Scanner;

public class Exam02 {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);

        int a, b, c;

        a = s.nextInt();
        b = s.nextInt();
        c = a + b;

        s.close();
        System.out.println(a + " + " + b + " = " + c);

    }
}
