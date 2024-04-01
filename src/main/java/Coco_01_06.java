import java.util.Scanner;

public class Coco_01_06 {
    public static void main(String[]args){

        Scanner s = new Scanner(System.in);
        int a,b,c;
        System.out.println("입력 수를 작성하시오 : ");

        a = s.nextInt();
        b = s.nextInt();
        c = a * b;

        System.out.println(a + " * " + b + " = " + c);

        s.close();

    }
}
