package week1PPT题目;
//https://leetcode-cn.com/problems/valid-anagram/submissions/
//两个单词是否由相同的字母组成
public class IsAnagram {
//    1
    public boolean  isAnagram(String s,String t){
        int[] alphabet = new int[26];
        for (int i = 0;i<s.length();i++)alphabet[s.charAt(i)-'a']++;
        for (int i = 0;i<t.length();i++)alphabet[t.charAt(i)-'a']--;
        for (int i :alphabet)if (i != 0)return false;
        return true;
    }

}
