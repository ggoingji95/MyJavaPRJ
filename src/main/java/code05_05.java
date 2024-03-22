import java.util.Scanner;

public class code05_05 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int  num;

        System.out.println("숫자 입력 ==> ");
        num = s.nextInt();

        if (num%2 ==0)
            System.out.println("짝수입니다.");

        else
            System.out.println("홀수입니다.");

        s.close();


    }
}
