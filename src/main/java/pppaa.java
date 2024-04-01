import java.util.Scanner;

public class pppaa {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        int num;
        System.out.println("정수로 입력하세요: ");
        num = s.nextInt();

        if (num%15==0) {
            System.out.println("3과 5의 배수입니다.");
        }
        else if (num%5==0){
            System.out.println("5의 배수입니다");
        }

        else if (num%3==0){
            System.out.println("3의 배수 입니다.");


        }

        s.close();

    }
}
