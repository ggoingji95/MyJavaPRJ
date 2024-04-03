import java.util.Scanner;

public class Coco01_27 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        int num;
        System.out.println("입력하고 하는 배수값을 작성해주세요");
        num=s.nextInt();

        if(num%21==0){
            System.out.println("7과 3의 배수 모두 만족합니다.");
        }
        else if(num%7==0){
            System.out.println("7의 배수입니다.");
        }

        else if(num%3==0){
            System.out.println("3의 배수입니다.");
        }

        else{
            System.out.println("조건에 맞지 않는 배수값을 입력 하셨습니다.");

        }
        s.close();



    }
}
