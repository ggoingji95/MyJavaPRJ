import java.util.Scanner;

public class Coco01_27 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int num;
        System.out.println("자연수를 입력해보세요 ^^ : ");
        num=s.nextInt();
        if(num%21==0){
            System.out.println("7과 3의 배수를 입력하셨습니다");
        }
        else if(num%7==0){
            System.out.println("7의 배수를 입력하셨습니다");
        }
        else if (num%3==0){
        System.out.println("3의 배수를 입력하셨습니다.");
        }
        s.close();
    }
}
