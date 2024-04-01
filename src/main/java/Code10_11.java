import java.util.Scanner;

public class Code10_11 {
    public static void main(String [] args){

        Scanner s = new Scanner(System.in);

        int num;
        System.out.println("숫자를 입력하세요 : ");
        num =s.nextInt();

        if(num%2==0)
            System.out.println("짝수입니다 :");

        else
            System.out.println("홀수입니다 : ");


    }
}
