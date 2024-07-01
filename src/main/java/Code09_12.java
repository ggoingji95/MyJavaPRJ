import java.util.*;

public class Code09_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map = null;

        for(int i = 0; i < 3; i++){
            System.out.print("이름 : ");
            String name = scanner.next();

            System.out.print("이메일 : ");
            String email = scanner.next();

            System.out.print("부서 : ");
            String dept = scanner.next();

            map = new HashMap<>();

            map.put("name", name);
            map.put("email", email);
            map.put("dept", dept);

            list.add(map);

            map = null;


            int listsize = list.size();

            System.out.println("저장된 데이터의 수 : " + listsize);

            System.out.println("1세대 반복문");

            for(int ii= 0; i<listsize; i++){
                Map<String,String> rMap = list.get(i);

                System.out.println("name : " + rMap.get("name"));
                System.out.println("email : " + rMap.get("email"));
                System.out.println("dept  : " +rMap.get("dept"));

                rMap = null;

                System.out.println("2세대 반복문");
                for(Map<String,String> rrMap : list) {
                    System.out.println("name : " +rMap.get("name"));
                    System.out.println("email : " +rMap.get("email"));
                    System.out.println("dept : " + rMap.get("dept"));
                }

                System.out.println("3세대 반복문");
                list.forEach(rrMap -> {
                    System.out.println("name : " + rrMap.get("name"));
                    System.out.println("email : " + rrMap.get("email"));
                    System.out.println("dept : " +rrMap.get("dept"));

                });

                System.out.println("4세대 반복문");

                list.parallelStream().forEach(rrMap ->{
                    System.out.println("name : " + rrMap.get("name"));
                    System.out.println("email " +rrMap.get("email"));
                    System.out.println("dept : " +rrMap.get("dept"));
                });



            }


        }

    }
}
