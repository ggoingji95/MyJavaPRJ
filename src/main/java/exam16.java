import java.util.Scanner;

public class exam16 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int a;
        a = s.nextInt();

        if(a%48==0){
            System.out.println("8과 6의 배수 두 수 모두 만족합니다.");
        }
        else if (a%8==0){
            System.out.println("8의 배수 만족합니다.");
        }
        else if(a%6==0){
            System.out.println("6의 배수 만족합니다.");
        }
        else{
            System.out.println("??? 값을 잘못 입력한거 같습니다....");
        }

        s.close();
        System.out.println("정말 수고 많으셨습니다.....");


    }
}
