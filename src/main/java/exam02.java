public class exam02 {
    public static void main(String[]args){
        String str = "난생 처음 자바 a b c";
        String str1, str2;



        int len;
        len = str.length();


        str1=str.toUpperCase();
        System.out.println(str1);
        str2=str.toLowerCase();
        System.out.println(str2);
        System.out.println(str.indexOf("난생"));
        System.out.println(str.indexOf("난생"));
        System.out.println(str.indexOf("난생",4));
        System.out.println("문자열 " + str);
        System.out.println("문자열 길이 " + len);
    }
}
