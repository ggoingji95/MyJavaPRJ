import java.util.Scanner;

public class exam20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        a = s.nextInt();
        b = s.nextInt();
        int hap = 0;

        if (a>b) {
            for (int i = a; i>=b; i--) {
                if (i%2 !=0) {
                    hap += i;
                }
            }
        } else if (a<b) {
            for (int i=a; i<=b; i++) {
                if (i%2!=0) {
                    hap+=i;
                }
            }
        }
        System.out.println("입력값에 따른 짝수값만 구하기 " +hap);

    }
}