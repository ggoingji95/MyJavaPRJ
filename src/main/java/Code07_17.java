import java.util.Scanner;

public class Code07_17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        int hap = 0;

        while(true){

            System.out.printf("무한으로 곱하는 수학랜드에 오신 여러분 환영합니다.\n");
            System.out.println("곱하고자 하는 첫번째 숫자를 입력해주세요 , 만약 0이 나올경우 본 프로그램은 강제종료되니 유의해주세요 ");
            a = s.nextInt();
            if(a==0)
                break;
            System.out.println("곱하고자 하는 두번째 숫자를 입력해주세요 ");
            b = s.nextInt();

            hap = a * b;
            System.out.println(hap);

        }


        System.out.println("0이 나와 계산을 종료합니다." );

    }
}
