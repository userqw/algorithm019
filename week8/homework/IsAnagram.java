package homework;

public class IsAnagram {
    public boolean isAnagram(String s, String t){
        int n=s.length(),m = t.length();
        if(n!=m)
            return false;
        int a[]=new int[26];
        for(int i=0;i<n;i++){
            a[s.charAt(i)-'a']++;
            a[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
            if(a[i]!=0)
                return false;
        return true;
    }

}
