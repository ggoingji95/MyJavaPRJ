class Tree{
    String color;

    void setTree(String color){
        this.color = color;

    }

}

class AppleTree extends Tree{
    String color;
    void SetTree(){
        System.out.printf("노란색 색상으로 설정 하셨습니다.");

    }

}

public class Exam28 {
    public static void main(String[] args) {
        AppleTree aTree = new AppleTree();
        aTree.SetTree();
    }

}
