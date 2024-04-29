import java.util.Scanner;

public class exam15 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int a,b;
        a = s.nextInt();
        b = s.nextInt();
        int hap = 0;

        if(a>b){
            for(int i =a; i>=b; i--){
                if(i%2!=0){
                    hap+=i;
                }
            }
        }
        else if (a<b){
            for(int i =a; i<=b; i++){
                if(i%2!=0){
                    hap+=i;
                }
            }
        }
        s.close();
        System.out.println("입력값에 계산을 부여받는 홀수 합계 값 구하기 " + hap);
    }
}
