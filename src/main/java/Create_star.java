public class Create_star {
    public static void main(String[] args){
        for (int i=1; i<=7; i++){
            if(i<=4) {
                for (int j=1; j<=i;j++){
                    System.out.print("*");
                }
            } else {
                for (int r=0; r<8-i; r++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
