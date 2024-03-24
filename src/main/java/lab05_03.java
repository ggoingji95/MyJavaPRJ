import java.util.Scanner;

public class lab05_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int  year;
        System.out.printf("출생 연도를 입력하세요 ==> ");
        year = s.nextInt();

        switch (year % 12) {

            case 0:
                System.out.printf("원숭이띠");
                break;
            case 1:
                System.out.printf("닭띠");
                break;
            case 2:
                System.out.printf("개띠");
                break;
            case 3:
                System.out.printf("돼지띠");
                break;
            case 4:
                System.out.printf("쥐띠");
                break;
            case 5:
                System.out.printf("소띠");
                break;
            case 6:
                System.out.printf("호랑이띠");
                break;
            case 7:
                System.out.printf("토끼띠");
                break;
            case 8:
                System.out.printf("용띠");
                break;
            case 9:
                System.out.printf("뱀띠");
                break;
            case 10:
                System.out.printf("말띠");
                break;
            case 11:
                System.out.printf("양띠");
                break;
        }
        s.close();
    }
}
