import java.util.Scanner;

public class Coco01_17 {
    public static void main(String[]args){
        Scanner s = new Scanner (System.in);

        int num;
        System.out.println("성적을 입력하세요 : ");
        num = s.nextInt();

        if(num>=90){
            System.out.println("A");
        }
        else if (num>=80){
            System.out.println("B");
        }
        else if (num>=70){
            System.out.println("C");
        }
        else if (num>=60){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
        System.out.println("성적입니다.");
        System.out.println("수고 하셨습니다.");

        s.close();
    }
}
