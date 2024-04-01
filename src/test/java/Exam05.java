import java.util.Scanner;

public class Exam05 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int num;
        System.out.println("자연수 값을 입력해주세요 : ");
        num = s.nextInt();

        if(num%15==0){
            System.out.println("5와 3의 배수를 입력해주세요");
        }
        else if (num%5==0){
            System.out.println("5의 배수를 입력해주세요");
        }

        else if (num%3==0){
            System.out.println("3의 배수를 입력해주세요");
        }

        else {
            System.out.println("잘못된 수를 입력하셨습니다.");
        }

        System.out.println("수고하셨습니다.");

        s.close();

    }
}
