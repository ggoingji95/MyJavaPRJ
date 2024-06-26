public class exam25 { // 본 클래스는 exam25라고 정의한다.
    public static void main(String[]args){ // 공개형이며 리턴값이 필요없는 메서드를 실행한다.
        int i,k;  //int에는 i,k라는 일종의 변수값(그릇)을 선언한다/

        for(i=0; i<4; i++){ //for문은 초깃값, 조건식, 증가(감소)값이 주어진다. 본 초기 for문에서는
            //i는 초기값 0 조건식은 i는 4보다 작아야하며 이 조건 부합시 i는 1씩 증가하도록 하였다.
            for(k=1; k<8; k++){ //중첩for문 또한 마찬가지 k는 1부터 시작하며 k는 8보다 작아야하며 이 조건 부합시 k는 1씩 증가한다.
                if(k>3-i&&k<5+i){ // if문에서는 k는 3-i보다 크면서 &&(그리고)라는 관계연산자로 묶고, k는 5+i보다 작아야한다는  조건을 주었다.

                    System.out.print("*"); // 만약 이 조건이 부합할경우 *을 출력한다.
                }
                else{ // if에서 * 조건이 부합하지 않을시 공백을 출력한다.
                    System.out.print(" ");
                }
            }
            System.out.println();  //자바는 객체지향 언어이다. 순차적으로 계산하며 내려오는 구조이다.
            // if or else까지 내려온 for문은 println을 만나 줄넘김을하고, 여기서 끝나는것이 아닌 다시 한번 for문으로 돌아가 조건이 끝날때까지 반복한다.
        }
    }
}
