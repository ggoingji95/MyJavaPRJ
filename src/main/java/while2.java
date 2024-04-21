import java.util.Scanner;

public class while2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        int hap = 0;
        System.out.println("안녕하세요! 첫번째 값이 0이 나오기전까지 무한으로 곱하는 계산기입니다.");
        System.out.println("입력하고자 하는 수를 0을 제외하고 계속 입력해주세요!");
        a = s.nextInt();
        b = s.nextInt();

        while (true) {
            System.out.println("첫번째 입력값을 작성해주세요 : ");
            a = s.nextInt();
            if (a == 0) {
                break;
            }
            System.out.println("두번째 입력값을 작성해주세요 : ");
            b = s.nextInt();

            hap = a * b;
            System.out.println(a+"*"+b+"="+hap);

        }
        System.out.println("이런 0을 입력하셨군요 그렇게 경고했는데");
        System.out.println("계산을 종료합니다.");
        s.close();
    }
}