class Bear{
    String shape;
    int xPos;
    int yPos;


    Bear(String value){
        shape = value;
    }

    void setposition(int x, int y){

        this.xPos = xPos;
        this.yPos = yPos;

    }
}
public class Exam01_02 {
    public static void main(String[] args) {
        Bear bear1 = new Bear("아빠곰");
        Bear bear2 = new Bear("엄마곰");
        Bear bear3 = new Bear("아기곰");

        System.out.printf("곰1은 [%s]입니다.\n", bear1.shape);
        System.out.println("곰1은 ["+bear1.shape+"]입니다");
        System.out.printf("곰2은 [%s]입니다.\n", bear2.shape);
        System.out.printf("곰3은 [%s]입니다.\n", bear3.shape);
    }
}
