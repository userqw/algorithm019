import java.util.HashMap;
import java.util.Map;

public class W6MainTest {
    public static void main(String[] args) {
//        String command = "G()(al)";
//        command = command.replaceAll("\\(()\\)", "o");
//        command = command.replaceAll("\\((.*?)\\)", "$1");
//
//        System.out.println(command);
//        String s = "";
//        for (int i = 1; i <=3; i++) {
//            s += Integer.toBinaryString(i);
//        }
//        System.out.println(s);
//
//        System.out.println(Integer.parseInt(s, 2));
        int i = numberOfMatches(14);
        System.out.println(i);

    }
    public int maxOperations(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>k)continue;
            int temp = k - nums[i];
            if (map.containsKey(temp)&&map.get(temp)>0){
                map.put(temp, map.get(temp) - 1);
                count++;
                continue;
            }else {
                map.put(nums[i],0 );
            }
        }
        return count;
    }

    public int concatenatedBinary(int n) {
        String s = "";
        for (int i = 1; i <= n; i++) {
            s+=Integer.toBinaryString(n);

        }
        return Integer.parseInt(s);

    }



    public static int numberOfMatches(int n) {
        int res =0;
        res=match(n,res);
        return res;
    }
    public static int match(int teamCount,int res){
        if(teamCount == 2)return ++res;
        int flag =teamCount%2;
        if(flag == 0){
            teamCount =teamCount/2;
            res+=teamCount+match(teamCount,res);
        }else{
            teamCount =(teamCount+1)/2;
            res+=(teamCount-1)+match(teamCount,res);
        }
        return res;
    }
}
