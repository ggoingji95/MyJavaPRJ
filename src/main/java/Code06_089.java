import java.util.Scanner;

public class Code06_089 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int a,b;
        int hap=0;

        while(true) {
            System.out.println("첫번재 입력값 :   ");
            a = s.nextInt();
            if (a == 0)
                break;

            System.out.println("두번째 입력값 : ");
            b = s.nextInt();
            hap = a + b;
            System.out.println(a + " + " + b + " = " + hap);
        }
        System.out.println("0을 입력해서 계산을 종료합니다~");
        s.close();
    }
}
