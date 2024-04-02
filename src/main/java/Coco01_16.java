public class Coco01_16 {
    public static void main(String[]args){
        String ss = " java 공부하자";
        String var1, var2;

        var1 = ss.toUpperCase();
        System.out.println(var1);
        var2 = ss.toLowerCase();
        System.out.println(var2);

        String str = "난생처음 자바";
        int len;

        len = str.length();
        System.out.println("문자열 :  " + str);
        System.out.println("문자열 길이 : " +len);
    }
}
