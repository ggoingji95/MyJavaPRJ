import javafx.util.converter.NumberStringConverter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Code09_13 {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        int listsize = list.size();
        System.out.println("저장된 데이터 수 " + listsize);

        for(int i = 0; i<listsize; i ++){
            System.out.println("a" +list.get(i));

            for(Integer a : list){
                System.out.println("숫자 " + a );
            }
        }

        list.forEach(a->System.out.println("a"+a ));
    }
}
