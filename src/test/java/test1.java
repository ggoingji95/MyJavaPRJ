public class test1 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[] Counter = new int[10];

        for(int i=0; i<numArr.length; i++){
            numArr[i] = (int) (Math.random()*10);
            System.out.println(numArr[i]);
        }
        System.out.println();

        for(int i=0; i<numArr.length; i++){
            Counter[numArr[i]]++;

        }
        for(int i=0; i<numArr.length; i++) {
            System.out.println(i + "의 개수 : " + Counter[i]);
        }
     }
}
