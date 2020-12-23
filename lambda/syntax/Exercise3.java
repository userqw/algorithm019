package syntax;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Exercise3 {
    public static void main(String[] args) {
        /*集合的遍历*/
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        /*遍历集合*/
//        list.forEach(System.out::println);
        /*输出所有偶数*/
        list.forEach(ele->{
            if ((ele&1)==0){
                System.out.println(ele);
            }
        });
    }
}
