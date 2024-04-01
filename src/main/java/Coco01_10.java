import java.util.Scanner;

public class Coco01_10 {
    public static void main(String []args){

        Scanner s = new Scanner(System.in );

        int num;
        System.out.println("정수값을 입력하세요");
        num=s.nextInt();

        if(num%72==0) {
            System.out.println("9와 8의 배수 입니다.");
        }
        else if (num%9==0){
            System.out.println("9의 배수입니다.");


        }

        else if(num%8==0){
            System.out.println("8의 배수입니다.");
        }
        s.close();

    }
}
