import java.util.Scanner;

public class Coco12345 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        int a, b;
        a = s.nextInt();
        b = s.nextInt();

        if(a > b){
            System.out.println("a는 b보다 큽니다.");
        }
        else if (a == b){
            System.out.println("a는 b와 같습니다.");
        }
        else if( a < b ){
            System.out.println("a는 b보다 작습니다.");
        }
        s.close();

    }
}
