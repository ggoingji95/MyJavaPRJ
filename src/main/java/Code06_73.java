import java.util.Scanner;

public class Code06_73 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int num;
        num = s.nextInt();
        if(num%72==0){
            System.out.println("9와 8의 배수입니다.");
        }
        else if (num%9==0){
            System.out.println("9의 배수입니다.");
        }
        else if (num%8==0){
            System.out.println("8의 배수입니다.");
        }
        else
        {
            System.out.println("올바르지 못한 값을 입력하셨습니다.");
            System.out.println("다시 확인해주세요~");
        }
        s.close();





    }
}
