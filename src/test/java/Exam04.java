import java.util.Scanner;

public class Exam04 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        int a ;
        System.out.println("점수를 입력해주세요 : ");
        a = s.nextInt();

        if(a >= 70){
            System.out.println("축하합니다 합격입니다. 운전대에서 안전히 내려 오십시오");
        }

        else
        {
            System.out.println("탈락입니다. 다음에 또 만나요");
        }
        s.close();

    }
}
