import java.util.Scanner;

public class Code06_08 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        int a,b;
        System.out.println("200부터 300까지의 홀수 값은?????");
        a =s.nextInt();
        b =s.nextInt();



        int hap = 0;
        for(int i =a+1; i<=b; i+=2)
        {
            hap +=i;

            System.out.println("합 : " + hap);
        }

        System.out.println("200부터 300까지 홀수의 합 " + hap);
    }
}
