import java.util.Scanner;

public class code06_088 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int a;

        System.out.println("사용자 입력값에 따라 홀/짝을 구하는 프로그램입니다.");
        System.out.println("입력값을 입력해주세요");
        a = s.nextInt();
        System.out.println("홀수입니다");
        if(a%2==0){

        }
        else {
            System.out.println("짝수입니다.");
        }
        s.close();

    }
}
