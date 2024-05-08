class Cat1{
    String shape;
    int xPos;
    int yPos;

    Cat1(){
        shape = "귀여운 고양이";

    }

    void setposition(int x, int y){
        this.xPos = x;
        this.yPos = y;

    }
}


public class Code07_16 {
    public static void main(String[] args) {
        Cat1 cat1 = new Cat1();
        System.out.printf("고양이1은 [%s]입니다. \n", cat1.shape);

    }

}
