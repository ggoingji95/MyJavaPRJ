import java.util.Scanner;

public class Coco01_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int score;
        System.out.println("학점 입력 : ");
        score = s.nextInt();

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");

        }
        System.out.println("학점입니다.");

        s.close();
    }
}