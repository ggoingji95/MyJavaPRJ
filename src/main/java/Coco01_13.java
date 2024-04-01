public class Coco01_13 {
    public static void main(String[]args){
        int hap = 0;
        for (int i =1001; i<=2000; i+=2){

            hap = hap + i;
        }
        System.out.println("1부터 2000까지의 홀수 합계 : " + hap);
    }
}
