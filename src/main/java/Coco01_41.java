import java.util.Scanner;

public class Coco01_41 {
    public static void main(String[]args){
        Scanner s  = new Scanner(System.in);
        int num;
        System.out.printf("자연수값을 입력하세요");
        num=s.nextInt();
        if(num%35==0){
            System.out.printf("7과 5의 배수입니다");
        }
        else if(num%7==0){
            System.out.printf("7의 배수입니다.");


        }
        else if(num%5==0){
            System.out.printf("5의 배수입니다.");
        }
        System.out.printf("수고 하셨습니다");

        s.close();
    }
}
