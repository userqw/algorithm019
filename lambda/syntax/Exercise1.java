package syntax;

import java.util.ArrayList;

public class Exercise1 {
    public static void main(String[] args) {
        /*集合排序*/
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("张三", 18));
        list.add(new Person("李四", 22));
        list.add(new Person("王五", 28));

        //根据年龄降序排列
        list.sort((o1, o2) -> o2.getAge() -o1.getAge());
        System.out.println(list);
    }
}
