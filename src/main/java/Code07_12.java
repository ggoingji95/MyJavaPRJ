class Rabbit{
    private String shape;
    private int xPos;
    private int yPos;

    void setPosition(int xPos, int yPos){
        this.xPos = xPos;
        this.yPos = yPos;

    }
}

public class Code07_12 {
public static void main(String[]args){

    Rabbit rabbit = new Rabbit();
    rabbit.setPosition(100,200);
    //rabbit.xPos = 100;   값을 변경하는 코드 추가함 즉 외부에서 접근하려 하기때문에  오류가 발생했음//
    //rabbit.yPos = 200;   만약 값의 수정을 원할시 private 안에 작성해야함 //
}

}
