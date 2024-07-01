class Bear{
    String shape;
    int xPos;
    int yPos;

    Bear(String value){
        shape = value;
    }

    void setposition(int x, int y){

        this.xPos = x;
        this.yPos = y;

    }

}


public class Code03_21 {
    public static void main(String[] args) {
        Bear b1 = new Bear("아빠곰");
        Bear b2 = new Bear("엄마곰");
        Bear b3 = new Bear("애기곰");

        System.out.printf("곰1의 모습은 [%s]입니다.\n",b1.shape);
        System.out.printf("곰2의 모습은 [%s]입니다.\n",b2.shape);
        System.out.printf("곰3의 모습은 [%s]입니다.\n",b3.shape);
        
    }
}
