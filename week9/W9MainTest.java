public class W9MainTest {
    public static void main(String[] args) {
        String s = "aaaabbcr";
        int[] count = count(s);
        for (int i = 0; i < count.length; i++) {
            if (count[i]!=0) {
                System.out.println((char) ('a' + i) + "共" + count[i] + "次");
            }
        }
    }

    public static int[] count(String s){
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        return count;
    }
}
