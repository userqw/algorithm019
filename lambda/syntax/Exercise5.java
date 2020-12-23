package syntax;

public class Exercise5 {
    public static void main(String[] args) {
        /*开启线程*/
        Thread t = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        });
        t.start();
    }

}
