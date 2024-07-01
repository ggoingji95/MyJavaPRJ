interface car11{
    void move();
}

interface cannon{
    void fire();
}

class tank implements car11,cannon{
    public void move(){
        System.out.println("탱크가 앞으로 이동합니다.");
    }

    public  void fire(){
        System.out.println("탱크가 불꽃을 발사합니다.");
    }
}
public class Code08_13 {
    public static void main(String[] args) {
        Tank tank1 = new Tank();
        tank1.move();
        tank1.fire();
    }
}
