import java.util.Scanner;

public class Lab05_09 {
    public static void main(String []args){

        Scanner s = new Scanner(System.in);

        int student;
        System.out.println("신분증 검사 진행 하겠습니다.");
        student= s.nextInt();

        if(student>=20) {
            System.out.println("협조 감사합니다, 즐거운 시간 되세요");
        }

        else {
            System.out.println("청소년은 집에 돌아갈 시간이에요!");
        }
             System.out.println("협조 감사합니다!!!");

        s.close();

    }
}
