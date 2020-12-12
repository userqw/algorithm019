import java.util.*;
//https://leetcode-cn.com/problems/group-anagrams/submissions/
//输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
//输出:
//[
//  ["ate","eat","tea"],
//  ["nat","tan"],
//  ["bat"]
//]
//
public class GroupAnagrams {
//    1
//    public List<List<String>> groupAnagrams(String[] strs) {
//        if (strs.length == 0) return new ArrayList();
//        Map<String, List> ans = new HashMap<String, List>();
//        for (String s : strs) {
//            char[] ca = s.toCharArray();
//            Arrays.sort(ca);
//            String key = String.valueOf(ca);
//            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
//            ans.get(key).add(s);
//        }
//        return new ArrayList(ans.values());
//    }

//    2
    public List<List<String>> groupAnagrams(String[] strs){
        if (strs.length == 0) return new ArrayList<>();
        Map<String,List> map = new HashMap<>();
        for (String word:strs){
            char[] ca = word.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!map.containsKey(key)) map.put(key, new ArrayList());
            map.get(key).add(word);

        }
        return new ArrayList(map.values());
    }
}
