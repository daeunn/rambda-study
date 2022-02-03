package WorkTest;

import java.util.HashSet;

public class MainTest {
    public static void main(String[] args) {
        PayType type = PayType.valueOf("KKOP");
        PayGroupAdvanced advanced = PayGroupAdvanced.findPayType(type);

        HashSet<String> set = new HashSet<>();
        for(PayAPIType x : PayAPIType.values()){
            set.add(x.getTableDiv());
        }
        String[] svcCds = set.toArray(new String[0]); // set을 배열로

        for(String xx: svcCds){
            System.out.println(xx);
        }


//        Arrays.stream(PayAPIType.values())
//                .distinct() // 중복제거
//                .forEach(type1 -> System.out.println(type1.getTableDiv()));

    }
}
