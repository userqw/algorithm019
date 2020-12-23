package syntax;

public class Syntax4 {
    public static void main(String[] args) {

        /*引用构造方法*/
        PersonCreator creator = Person::new;
        Person person = creator.getPerson();

        PersonCreator2 creator2 = Person::new;
        Person person2 = creator2.getPerson("张三", 18);

    }
}
interface PersonCreator{
    Person getPerson();
}
interface PersonCreator2{
    Person getPerson(String name,int age);
}
