import java.util.Scanner;

public class cco05_05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("성적에 따라 등급을 부여하는 채점기 입니다.");

        int score;
        System.out.println("성적을 입력해주세요  : ");
        score = s.nextInt();

        if(score>=90){
            System.out.println("A");
        }
        else if (score>=80){
            System.out.println("B");
        }
        else if (score>=70){
            System.out.println("C");
        }
        else if(score>=60){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
        System.out.println("학점입니다.");
        s.close();
    }
}