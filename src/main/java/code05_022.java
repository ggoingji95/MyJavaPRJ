import java.util.Scanner;

public class code05_022 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num;

        System.out.print("숫자입력하세요");
        num = s.nextInt();

        if (num%2 == 0)
            System.out.print("짝수입니다.");

        if (num%2 == 1)
            System.out.print("홀수입니다");

        s.close();

    }
}
