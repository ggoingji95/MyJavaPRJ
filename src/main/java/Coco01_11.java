import java.util.Scanner;

public class Coco01_11 {
    public static void main(String []args){

        Scanner s = new Scanner(System.in);

        int a, b, c;
        System.out.println("계산값을 입력하세요");

        a = s.nextInt();
        b = s.nextInt();
        c = a * b;

        System.out.println(a + " * " + b + " = " + c);



    }
}
