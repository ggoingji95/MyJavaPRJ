import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        a = s.nextInt();
        b = s.nextInt();
        int hap = 0;
        for (int i = a; i <= b; i++) {
            if (a % 2== 0) {
                hap += i;

            }
        }
        s.close();
        System.out.println("200부터 300까지 짝수의 합" + hap);

    }
}

