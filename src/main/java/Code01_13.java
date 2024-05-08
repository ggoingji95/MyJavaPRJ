class Dog{
    String shape;
    int xPos;
    int yPos;

    Dog(String vlaue){
        shape = vlaue;

    }

    void setposition(int x, int y){
        this.xPos = x;
        this.yPos = y;
    }
}



public class Code01_13 {
    public static void main(String[] args) {
        Dog d1 = new Dog("푸들");
        Dog d2 = new Dog("포메");
        Dog d3 = new Dog("햄스터");

        System.out.printf("앗 ! [%s]가 나타났다! \n",d1.shape);
        System.out.printf("앗 ! [%s]가 나타났다!\n", d2.shape);
        System.out.printf("앗 ! [%s]가 나타났다!\n",d3.shape);


    }
}
