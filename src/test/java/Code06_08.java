import java.util.Scanner;  //  스캐너 함수 사용시 위에 고정되는 값임
public class Code06_08 { /* 클래스는 code06_08명을 시작한다.*/
    public static void main(String[]args){ // 공개되있고 리턴할 값이 없는 메서드 메인 함수를 시작한다.
        Scanner s = new Scanner(System.in); // s라는 객체를 사용해 받아들이고 스캐너를 시작한다.

        int a,b;  // int a,b라는 변수값을 저장한다.
        a =s.nextInt();
        b =s.nextInt();
// a,b는 s 스캐너함수에 의해 지정된 값을 불러오고 사용한다.


        int hap = 0;  //hap이라는 값에 0을 저장한다.
        for(int i =a; i<=b; i++) // a,b는 200,300 입력값을 추후 받을거고 ,조건에 의해 증가할것이다.
            // 초깃값은 1번 사용후 사라진후  조건식,증감값은 반복된다.
        {
            if(i%2!=0) { // if문을 사용해 (i%2!=0)은 %로 나눈 나머지가 0이 아니라면 같지 않다면 hap을 i씩 만큼 증가시킨다.
                hap += i;
            }

        }

        System.out.println("200부터 300까지 홀수의 합 " + hap); // 200부터 300 홀수합은?
    }
}
