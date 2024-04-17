public class exam03 { // public class는 exam03으로 정의한다.
    public static void main(String[]args){ // 공개하고 리턴값이 필요없는 매서드를 시작한다.
        for(int i = 0; i < 4; i++){   // for문은 초깃값 조건식 증감값이 주어진다.
                                           // i는 0부터 시작하고 i는 4보다 작아야된다 즉 3까지 반복 , 초깃값은 1번 실행후 없어
                                            //지므로, 그 다음 조건식, 반복할문장(별횟수) 증감값만 계속 ++한다.
            for(int k = 0; k<8; k++){               //위에서와 마찬가지로 초깃값 0 k는 8보다 작아야 한다 7까지 반복
                if(k>3-i&&k<5+i){   //k는 3-i보다 커야하며 그리고 k는 5+1보다 커야한다.
                    System.out.print("*"); //조건이 맞을경우 위의 문장을 실핸한다.
                }
                else{
                    System.out.print(" ");  //만약 if조건이 맞지 않다면 공백을 출력한다
                }
            }
            System.out.println(); // i값이 바뀔때마다 줄을 체인지한다.

        }
    }

}
