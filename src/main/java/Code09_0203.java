import java.util.Scanner;

public class Code09_0203 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numAry = new int[4];
        int hap = 0;

        System.out.print("첫번째 숫자  : ");
        numAry[0] = s.nextInt();
        System.out.print("두번째 숫자 :  ");
        numAry[1] = s.nextInt();
        System.out.print("세번째 숫자  : ");
        numAry[2] = s.nextInt();
        System.out.print("네번째 숫자 : ");
        numAry[3] = s.nextInt();

        hap = numAry[0]+numAry[1]+numAry[2]+numAry[3];
        System.out.println("배열의 합계 " +hap);
    }
}
