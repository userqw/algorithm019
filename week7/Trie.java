import com.sun.scenario.animation.shared.TimerReceiver;

//https://leetcode-cn.com/problems/implement-trie-prefix-tree/
////    Trie树代码模板

/*
 * Trie树的基本性质
 *
 * 1结点本身不存完整单词
 * 2从根节点到某一结点，路径上经过的字符连接起来，为该节点对应的字符串
 * 3每个节点的所有子节点路径代表的字符都不相同*/

//1
//public class Trie {
//
//    private boolean isEnd;
//    private Trie[]next;
//    /*Initialize your data structure here*/
//    private Trie(){
//        isEnd = false;
//        next = new Trie[26];
//    }
//
//    /*Inserts a word into the trie*/
//    public  void insert(String word){
//        if (word == null|| word.length()==0)return;
//        Trie curr = this;
//        char[] words = word.toCharArray();
//        for (int i = 0; i < words.length; i++) {
//            int n = words[i] - 'a';
//            if (curr.next[n]==null) curr.next[n] = new Trie();
//            curr = curr.next[n];
//        }
//        curr.isEnd = true;
//    }
//    /*Returns if the word is in the trie*/
//    public boolean search(String word){
//        Trie node = searchPrefix(word);
//        return node != null && node.isEnd;
//    }
//    /*Returns if there is any word in the trie that starts with the given prefix*/
//    public boolean startsWith(String prefix){
//        Trie node = searchPrefix(prefix);
//        return node != null;
//    }
//
//
//    private Trie searchPrefix(String word) {
//
//        Trie node = this;
//        char[] words = word.toCharArray();
//        for (int i = 0; i < words.length; i++) {
//            node = node.next[words[i] - 'a'];
//            if (node == null) return null;
//        }
//        return node;
//    }
//}



//2
//public class Trie{
//    private boolean isEnd;
//    private Trie[] next;
//
//    /*Initialize your data structure here*/
//    public Trie(){
//        isEnd = false;
//        next = new Trie[26];
//    }
//
//    /*Insert a word into the trie*/
//    public void insert(String word){
//        if (word == null || word.length() == 0)return;
//        Trie curr = this;
//        char[] words = word.toCharArray();
//        for (int i = 0; i < words.length; i++) {
//            int n = words[i] - 'a';
//            if (curr.next[n] == null) curr.next[n] = new Trie();
//            curr = curr.next[n];
//        }
//        curr.isEnd = true;
//    }
//    public boolean search(String word){
//        Trie node = searchPrefix(word);
//        return node != null && node.isEnd;
//    }
//    public boolean startWith(String prefix){
//        Trie node = searchPrefix(prefix);
//        return node != null;
//
//    }
//
//    private Trie searchPrefix(String word) {
//
//        Trie node = this;
//        char[] words = word.toCharArray();
//        for (int i = 0; i < words.length; i++) {
//            node = node.next[words[i] - 'a'];
//            if (node == null) return null;
//        }
//        return node;
//    }
//}

//3
//public class Trie{
//    private boolean isEnd;
//    private Trie[] next;
//
//    public Trie(){
//        isEnd = false;
//        next = new Trie[26];
//    }
//    public void insert(String word){
//        if (word == null||word.length()==0)return;
//        Trie curr = this;
//        char[] words = word.toCharArray();
//        for (int i = 0; i < words.length; i++) {
//            int n = words[i] - 'a';
//            if (curr.next[n]==null) curr.next[n] = new Trie();
//            curr = curr.next[n];
//        }
//        curr.isEnd = true;
//    }
//    public boolean search(String word){
//        Trie node = searchPrefix(word);
//        return node != null && node.isEnd;
//    }
//    public boolean startWith(String prefix){
//        Trie node = searchPrefix(prefix);
//        return node != null;
//    }
//
//    private Trie searchPrefix(String word) {
//        Trie  node = this;
//        char[] words = word.toCharArray();
//        for (int i = 0; i < words.length; i++) {
//            node = node.next[words[i] - 'a'];
//            if (node == null) return null;
//        }
//        return node;
//
//    }
//
//
//}


//4
//public class Trie{
//    private boolean isEnd;
//    private Trie[] next;
//
//    public Trie(){
//        isEnd = false;
//        next = new Trie[26];
//    }
//
//    public void insert(String word){
//        if (word==null||word.length()==0)return;
//        Trie curr = this;
//        char[] words = word.toCharArray();
//        for (int i = 0; i < words.length; i++) {
//            int n = words[i] - 'a';
//            if (curr.next[n]==null) curr.next[n] = new Trie();
//            curr = curr.next[n];
//        }
//        curr.isEnd = true;
//    }
//
//    public boolean search(String word){
//        Trie node = searchPrefix(word);
//        return node != null && node.isEnd;
//    }
//    public boolean startWith(String prefix){
//        Trie node = searchPrefix(prefix);
//        return node != null;
//    }
//
//    private Trie searchPrefix(String word) {
//        Trie node = this;
//        char[] words = word.toCharArray();
//        for (int i = 0; i < words.length; i++) {
//
//            node = node.next[words[i] - 'a'];
//            if (node == null) return null;
//        }
//        return node;
//    }
//}

//5
//public class Trie{
//    private boolean isEnd;
//    private Trie[] next;
//
//    public Trie(){
//        isEnd = false;
//        next = new Trie[26];
//    }
//
//    public void insert(String word){
//        if (word ==null||word.length()==0)return;
//        Trie curr = this;
//        char[] words = word.toCharArray();
//        for (int i = 0; i < words.length; i++) {
//            int n = words[i] - 'a';
//            if (curr.next[n]==null)curr.next[n]=new Trie();
//            curr = curr.next[n];
//        }
//        curr.isEnd = true;
//    }
//    public boolean search(String word){
//        Trie node = searchPrefix(word);
//        return node != null && node.isEnd;
//    }
//    public boolean startWith(String perfix){
//        Trie node = searchPrefix(perfix);
//        return node != null;
//    }
//
//    private Trie searchPrefix(String word) {
//        char[] words =word.toCharArray();
//        Trie node = this;
//        for (int i = 0; i < words.length; i++) {
//            node = node.next[words[i] - 'a'];
//            if (node==null) return null;
//        }
//        return node;
//    }
//}
/*
 * Trie树的基本性质
 *
 * 1结点本身不存完整单词
 * 2从根节点到某一结点，路径上经过的字符连接起来，为该节点对应的字符串
 * 3每个节点的所有子节点路径代表的字符都不相同*/
//6
//public class Trie{
//    private boolean isEnd;
//    private Trie[] next;
//
//    public Trie(){
//        isEnd = false;
//        next = new Trie[26];
//    }
//
//    public void  insert(String word){
//        if (word.length()==0||word==null)return;
//        Trie curr = this;
//        char[] words = word.toCharArray();
//        for (int i=0;i<words.length;i++){
//            int n = words[i] - 'a';
//            if (curr.next[n]==null)curr.next[n]=new Trie();
//            curr = curr.next[n];
//        }
//        curr.isEnd = true;
//    }
//    public boolean search(String word){
//        Trie node = searchPrefix(word);
//        return node == null && node.isEnd;
//    }
//    public boolean startWith(String prefix){
//        Trie node = searchPrefix(prefix);
//        return node != null;
//    }
//    private Trie searchPrefix(String word) {
//        Trie node = this;
//        char[] words = word.toCharArray();
//        for (int i=0;i<words.length;i++){
//            node = node.next[words[i] - 'a'];
//            if (node==null) return null;
//        }
//        return node;
//    }
//}

public class Trie{
    private boolean isEnd;
    private Trie[] next;

    public Trie(){
        isEnd = false;
        next = new Trie[26];
    }

    public void  insert(String word){
        if (word.length()==0||word==null)return;
        Trie curr = this;
        char[] words = word.toCharArray();

        for (int i = 0; i < words.length; i++) {
            int n = words[i] - 'a';
            if (curr.next[n]==null) curr.next[n] = new Trie();
            curr = curr.next[n];
        }
        curr.isEnd = true;
    }
    public boolean search(String word){
        Trie node = searchPrefix(word);
        return node != null && node.isEnd;
    }
    public boolean startWith(String prefix){
        Trie node = searchPrefix(prefix);
        return node != null;
    }
    private Trie searchPrefix(String word){
        Trie node = this;
        char[] words = word.toCharArray();
        for (int i = 0; i < words.length; i++) {
            node = node.next[words[i] - 'a'];
            if (node ==  null) return null;
        }
        return node;
    }
}