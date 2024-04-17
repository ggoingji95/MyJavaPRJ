public class ccode04_12 {
    public static void main(String[]args){
        String ss = "i want to go to america";
        String var1, var2;
        int len;

        len = ss.length();


        var1=ss.toUpperCase();
        System.out.println(var1);
        var2=ss.toLowerCase();
        System.out.println(var2);
        System.out.println("문자열 " + ss);
        System.out.println("문자열 길이 " + len);
        System.out.println(ss.indexOf("want"));
        System.out.println(ss.indexOf("want"));
        System.out.println(ss.indexOf("want",4));
    }
}
