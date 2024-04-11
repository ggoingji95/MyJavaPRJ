import java.util.Scanner;

public class Code05_09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a;
        System.out.println("점수 입력 : ");
        a = s.nextInt();

        if (a >= 100) {
            System.out.println("A++");
        } else if (a >= 90) {
            System.out.println("A");
        } else if (a >= 80) {
            System.out.println("B");
        } else if (a >= 70) {
            System.out.println("C");
        } else if (a >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        System.out.println("수고 하셨습니다.");

    }
}