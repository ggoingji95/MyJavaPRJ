import java.util.Scanner;

public class Code05_05 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        int a;
        System.out.println("동전 던지기 게임을 시작합니다. ");
        System.out.println(" 자 ~ 시작 !");

        a = s.nextInt();

        if(a%2==0)
        {
            System.out.println("앞면입니다.");
        }

        else
        {
            System.out.println("뒷면입니다.");
        }

        System.out.println("재미있는 동전던지기 게임이 끝났습니다.");

        s.close();


    }
}
