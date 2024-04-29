import java.util.Scanner;

public class exam24 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int a,b;
        int hap = 0;
        a = s.nextInt();
        b = s.nextInt();
        if (a>b){
            for(int i =a; i>=b; i--){
                if(i%2!=0){
                    hap+=i;
                }
            }
        }
        else if(a<b){
            for(int i =a; i<=b; i++){
                if(i%2!=0){
                    hap+=i;
                }
            }
        }
       System.out.println("사용자의 홀수 값만 구하는 출력기 " +hap);

    }
}
