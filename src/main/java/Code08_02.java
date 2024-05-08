class Rabbit{
    String shape;
    int xPos;
    int yPos;

    void move(int x, int y){
        this.xPos = x;
        this.yPos = y;

    }
}

class HouseRabbit extends Rabbit{
    String owner;
    void eatfood(){
        System.out.println("집토끼가 맛있는 사료를 먹습니다.");
    }
}

class MountainRabbit extends Rabbit{
    String mountain;
    void eatWildglass(){
        System.out.printf("산토끼가 산뜻한  풀을 먹습니다.");

    }
}





public class Code08_02 {
    public static void main(String[] args) {

    }
}
