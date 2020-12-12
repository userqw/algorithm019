//import overwriteDeque.Array;

import com.sun.org.apache.regexp.internal.RE;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//https://leetcode-cn.com/problems/valid-anagram/submissions/
public class IsAnagram {
    /**
     * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词
     */

    /**两种方法：1用Arrays.equals()对两个排序字符数组进行比较
     *          2统计每个字符的数量
     *          3用HashMap统计
     *
    1
    public boolean isAnagram(String s,String t){
        if (s.length()!=t.length()){
            return false;
        }
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }
     **/


//    1
//    pulic boolean isAnagram(String s, String t){
//        if (s.length()!=t.length())return false;
//        char[] char1 = s.toCharArray();
//        char[] char2 = t.toCharArray();
//        Arrays.sort(char1);
//        Arrays.sort(char2);
//        return Arrays.equals(char1,char2);
//    }
//

//    2
//    public boolean idAnagram(String s,String t){
//        char[] alphabet = new char[26];
//        for (char c:s.toCharArray())alphabet[c-'a']++;
//        for (char c: t.toCharArray())alphabet[c-'a']--;
//        for (char c:alphabet)if (c!=0)return false;
//        return true;
//    }

    public boolean isAnagram(String s,String t){
        if (s.length()!=t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        for (int i =0;i<t.length();i++){
            char c = t.charAt(i);
            map.put(c, map.getOrDefault(c, 0) - 1);
            if (map.get(c)<0) return false;
        }
        return true;
    }
}
