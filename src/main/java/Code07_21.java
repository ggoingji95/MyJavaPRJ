class Dog{
    String shape;
    int xPos;
    int yPos;

    Dog(){
        shape = "푸들";
    }

    void setposition(int x, int y){
        this.xPos = x;
        this.yPos = y;
    }
}
public class Code07_21 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();

        System.out.printf("강아지1은 [%s]입니다.\n",dog1.shape);


    }
}
