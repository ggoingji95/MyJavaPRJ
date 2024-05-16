interface Car7{
    void move();
}

interface Cannon{
    void fire();
}

class Tank implements Car7, Cannon{
    public void move(){
        System.out.println("탱크가 앞으로 이동합니다.");
    }

    public void fire(){
        System.out.println("탱크에서 대포를 발사합니다.");
    }
}

public class Code08_10{
    public static void main(String[]args){
        Tank tank1 = new Tank();
        tank1.move();
        tank1.fire();
    }
}