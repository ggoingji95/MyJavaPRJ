public class code02_099 {
    public static void main (String[]args){

        int num1;
        double num2;
        String str;

        str = "3500";
        num1 = Integer.parseInt(str);
        System.out.println("문자열 ==> : " + num1);

        str = "3.14";
        num2 = Double.parseDouble(str);
        System.out.println("문자열 ==> 실수 : " + num2);
    }
}