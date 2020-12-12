package week1PPT题目;

import java.util.Stack;

//https://leetcode-cn.com/problems/valid-parentheses/submissions/
//判断是否为有效匹配括号
public class ParentheisIsValid {
//    1
//   public boolean isValid(String s){
//       Stack<Character> stack = new Stack<>();
//       for (char c: s.toCharArray()){
//           if (c == '(')stack.push(')');
//           else if (c == '[')stack.push(']');
//           else if (c == '{')stack.push('}');
//           else if (stack.isEmpty() || stack.pop()!=c)return  false;
//       }
//       return stack.isEmpty();
//   }

    //    2
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            else if (stack.isEmpty()||stack.pop()!=c)return false;
        }
        return stack.isEmpty();
    }


}
