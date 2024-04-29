import java.util.Scanner;

public class exam13 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int a,b,i;
        a = s.nextInt();
        b = s.nextInt();
        int hap = 0;

        if(a>b){
            for(i=a; i>=b; i--){
                if(i%2!=0){
                    hap+=i;
                }


            }
        }
        else if (a<b){
            for(i=a; i<=b; i++){
                if(i%2!=0){
                    hap+=i;
                }

            }
         }
        System.out.println("입력값에 계산을 하는 hap의 홀수 합 구하기 " +hap);
    }
}
