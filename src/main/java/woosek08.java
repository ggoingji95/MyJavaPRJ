public class woosek08 {
    public static void main(String[]args){
        int num1;
        double num2;
        String str;

        str = "0410";
        num1 = Integer.parseInt(str);
        System.out.println("문자열 ==> 정수 : " + num1);

        str = "4.10";
        num2 = Double.parseDouble(str);
        System.out.println("문자열 ==> 실수 : " + num2);
    }
}
