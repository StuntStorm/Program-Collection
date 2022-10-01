package Stack;
import java.util.Stack;

public class ValidParenthesisProblem {
    private ListNode top;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }

    public ValidParenthesisProblem(){
        top = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '{' || c == '(' || c == '['){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else{
                    char top = stack.peek();
                    if((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')){
                        stack.pop();
                    }else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args){
        ValidParenthesisProblem vp = new ValidParenthesisProblem();
        String s1 = "{}";

        System.out.println(vp.isValid(s1));
    }
}
