import java.util.Scanner;

public class code03_06 {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a, b;
        a = s.nextInt();
        b = s.nextInt();

        if ( a > b){

            for(int i = a ; i>b ; i--){
                if(i%3==0){
                    System.out.println(i);
                }
            }
        } else{
            for(int i = a; i < b; i++){

                if(i % 3==0){
                    System.out.println(i);
                }
            }
        }

    }
}