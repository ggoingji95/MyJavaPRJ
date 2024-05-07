class haye {
    //하예의 속성
    String shape;
    int xPos;
    int yPos;

    void setposition(int x, int y) {
        xPos = x;
        yPos = y;

    }
}

public class Ccode07_06 {


    public static void main(String[] args){
        haye ha1 = new haye();
        ha1.setposition(100,100);
        haye ha2 = new haye();
        ha2.setposition(-100,-80);
    }
}
