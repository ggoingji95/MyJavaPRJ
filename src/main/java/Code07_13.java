class Haye {
    String shape;
    int xPos;
    int yPos;

    Haye() {
        shape = "미래의 박사님";
    }

    void setposition(int x, int y){

        this.xPos = x;
        this.yPos = y;
    }
}

public class Code07_13{
    public static void main(String[] args) {

        Haye haye = new Haye();

        System.out.printf("하예의 미래는 [%s]으로  될것으로 추측됩니다. ",haye.shape);
    }
}
