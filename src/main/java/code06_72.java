import java.util.Scanner;

public class code06_72 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int a, b;
        int hap = 0;

        while(true){
            System.out.println("첫번째 입력값을 입력해주세요 : ");
            a = s.nextInt();
            if(a==0){
                break;
            }

            System.out.println("두번째 입력값을 입력해주세요 : ");
            b = s.nextInt();

            hap = a + b;
            System.out.println(a+"+"+b+"="+hap);


        }
        System.out.println("0을 입력해서 계산을 강제종료합니다.");
        System.out.println("다음에 바른값을 입력하시고 다시 이용해주세요");
        s.close();

    }
}
