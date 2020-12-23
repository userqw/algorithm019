package syntax;

import java.util.TreeSet;

public class Exercise2 {
    public static void main(String[] args) {
        //TreeSet

        TreeSet<Person> set = new TreeSet<>((o1, o2) -> {
            if (o1.getAge()>= o2.getAge()){
                return -1;
            }else {
                return 1;
            }
        });

        set.add(new Person("张三", 18));
        set.add(new Person("李四", 22));
        set.add(new Person("王五", 28));
        set.add(new Person("孙八", 18));
        System.out.println(set);

    }
}
