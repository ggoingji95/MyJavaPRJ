import java.util.Scanner;

public class code05_07 {
    public static void main(String[] args) {
        Scanner river = new Scanner(System.in);

        int  score;

        System.out.print("점수입력");
        score = river.nextInt();

        if (score >=90)
        System.out.println("A");
        else
            if (score>=80)
            System.out.println("B");
            else
                if (score>=70)
                    System.out.println("C");
                else
                    System.out.println("F");

                System.out.println("학점입니다");
                river.close();
    }
}
