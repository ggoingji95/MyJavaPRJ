import java.util.Scanner;

public class Coco01_18 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        int a ;
        System.out.println("자연수를 입력하세요");
        a = s.nextInt();

        if(a%15==0){
            System.out.println("5와 3의 배수를 입력 하셨습니다.");
        }

        else if(a%5==0){
            System.out.println("5의 배수를 입력 하셨습니다.");
        }

        else if (a%3==0){
            System.out.println("3의 배수를 입력 하셨습니다.");
        }

        else{
            System.out.println("잘못된 값을 입력하셨습니다.");
        }

        System.out.println("수고 하셨습니다.");

        s.close();


    }
}
