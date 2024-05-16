class Tiger{
    String shape;
    int xPos;
    int yPos;

    void move(int x, int y) {
        this.xPos = x;
        this.xPos = y;
    }
}
class AngryTiger extends Tiger{
    String owner;
    void killrabbit(){
        System.out.println("호랑이가 토끼를 잡았습니다.");
    }
}

class SadTiger extends Tiger{
    String Mountain;
    void Climbmountain(){
        System.out.println("호랑이가 산을 오르고 있습니다.");
    }
}
public class Code06_01{
    public static void main(String[] args) {

        AngryTiger atiger = new AngryTiger();
        SadTiger stiger = new SadTiger();


    }
}