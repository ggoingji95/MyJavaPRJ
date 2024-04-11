import java.util.Scanner;

public class Hsg {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str1,str2,str3;

        System.out.print("아이디 == > ");
        str1 = s.next();
        System.out.print("이름 == > ");
        str2 = s.next();
        System.out.print("메일 == > ");
        str3 = s.next();

        System.out.println("아이디는 "+str1+"이며, 이름은 "+str2+"이며, 이메일은 "+str3+"입니다");

        s.close();

    }
}
