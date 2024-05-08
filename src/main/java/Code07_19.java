

public class Code07_19 {
    public static void main(String[] args) {

        int i,k;
        for(i=0; i<4; i++){
            for(k=1; k<8; k++){
                if(k>3-i&&k<5+i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }


    }
}
