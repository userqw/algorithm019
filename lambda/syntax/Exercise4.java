package syntax;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exercise4 {
    public static void main(String[] args) {

        /*删除集合中满足条件的元素*/
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三", 18));
        list.add(new Person("李四", 22));
        list.add(new Person("王五", 28));
        /*删除集合中年龄大于18的人*/

        list.removeIf(ele -> ele.getAge() > 18);
        System.out.println(list);

    }

}
