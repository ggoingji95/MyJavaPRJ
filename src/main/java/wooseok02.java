import java.util.Scanner;

public class wooseok02 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        int a;
        a = s.nextInt();
        if(a%15==0){
            System.out.println("5와 3의 배수 만족합니다");
            System.out.println(" 15억을 받고싶어요");
            System.out.println("주먹도끼는 구석시대의 유물이다.");
        }
        else if(a%5==0){
            System.out.println("5의 배수 만족합니다.");
        }
        else if(a%3==0){
            System.out.println("3의 배수 만족합니다.");
        }
        else{
            System.out.println("해당사항 없다 집에가라");

        }
        s.close();

    }
}
