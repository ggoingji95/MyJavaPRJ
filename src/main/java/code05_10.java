import java.util.Scanner;

public class code05_10 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        int select;

        System.out.print("1~3 중에 선택하세요 : ");
        select = s.nextInt();

        switch(select) {
            case 1:
                System.out.println("1을 선택했습니다.");

            case 2:
                System.out.println("2를 선택했습니다.");


            case 3:
                System.out.println("3을 선택했습니다.");


            default:
                System.out.println("이상한 것을 선택했습니다.");
        }

        s.close();
    }
}
