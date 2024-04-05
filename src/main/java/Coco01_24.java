import java.util.Scanner;

public class Coco01_24 {
//    주석테스트
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num;
        System.out.println("자연수를 입력해주세요 : ");
        num = s.nextInt();

        if (num % 15 == 0) {
            System.out.println("5와 3의 배수를 입력하셨습니다.");
        } else if (num % 5 == 0) {
            System.out.println("5의 배수를 입력하셨습니다.");
        } else if (num % 3 == 0) {
            System.out.println("3의 배수를 입력하셨습니다.");
        } else {
            System.out.println("잘못된 값을 입력하셨습니다");

        }
        s.close();
    }

}
