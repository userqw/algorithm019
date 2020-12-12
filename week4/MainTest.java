import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {

        List<Integer> levaves1 = new ArrayList<>();
        List<Integer> levaves2 = new ArrayList<>();
        levaves1.add(3);
        levaves1.add(4);
        levaves2.add(4);
        levaves2.add(5);
        System.out.println(levaves1.equals(levaves2));
    }
}
