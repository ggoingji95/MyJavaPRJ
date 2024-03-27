public class code06_15 {
    public static void main(String[] args) {
        int hap = 0;
        for (int i =0; i<=100 ; i++) {
            if (i%4 ==0) {
                continue;
            }
            hap += i;

        }
        System.out.println("1~100의 합계(4의 배수 제외) : " +hap);
    }

}
