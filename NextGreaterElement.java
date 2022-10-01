package Stack;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
        private ListNode top;
        private int length;

        private class ListNode{
            private int data;
            private ListNode next;

            public ListNode(int data){
                this.data = data;
            }
        }

        public NextGreaterElement(){
            top = null;
            length = 0;
        }

        public int length(){
            return length;
        }

        public boolean isEmpty(){
            return length == 0;
        }

        public int[] nextGreater(int[] arr){
            int[] result = new int[arr.length];
            Stack<Integer> stack = new Stack<>();
            for(int i = arr.length-1; i >=0; i--){
                if(!stack.isEmpty()){
                    while (!stack.isEmpty() && stack.peek() <= arr[i]){
                        stack.pop();
                    }
                }
                if(stack.isEmpty()){
                    result[i] = -1;
                }else{
                    result[i] = stack.peek();
                }
                stack.push(arr[i]);
            }
            return result;
        }

        public static void main(String[] args){
            NextGreaterElement nxt = new NextGreaterElement();

            int[] arr = {4, 7, 3, 4, 8, 1};
            //System.out.println(arr);

            int[] result = nxt.nextGreater(arr);
            Arrays.stream(result).forEach(a-> System.out.print(a + " "));
        }

}
