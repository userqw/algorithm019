import java.util.HashMap;
import java.util.Map;

public class W2MainClass {
    public static void main(String[] args) {
//        Map<Character, Integer> map = new HashMap<>();
//        map.getOrDefault('c', 0);
//        map.put('c', 0);
//        System.out.println(map.getOrDefault('c',0));
//        System.out.println(map.values());
        
        int [] nums= new int[]{3,2,3,2,5};
        int i = majorityElement(nums);
        System.out.println(i);


    }


    public static  int majorityElement(int[] num){
        int major = num[0],count=1;
        for (int i = 1;i<num.length;i++){
            if (count == 0){
                count++;
                major = num[i];
            }else if (major == num[i]){
                count++;
            } else count--;
        }
        return major;
    }
}
