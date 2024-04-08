import java.util.Scanner;

public class Coco0234 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a;
        a = s.nextInt();
        if (a % 15 == 0) {
            System.out.println("5와 3의 배수 모두 만족합니다.");
        } else if (a % 5 == 0) {
            System.out.println("5의 배수입니다.");
        } else if (a % 3 == 0) {
            System.out.println("3의 배수입니다.");
        } else {
            System.out.println("해당사항 없습니다.");
        }
        s.close();

       }
}
