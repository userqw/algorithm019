package homework;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        char[] sArray = s.toCharArray();
        for(int i=0;i<sArray.length;i++){
            map.put(sArray[i],map.getOrDefault(sArray[i],0)+1);
        }
        for(int i = 0;i<sArray.length;i++){
            if(map.get(sArray[i])==1)return i;
        }
        return -1;
    }
}
