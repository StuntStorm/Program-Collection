package CircularSinglyLinkedList;



public class CreateCircularSLL {
    private ListNode last;
    private int length;

    private class ListNode{
        private ListNode next;
        private int data;

        public ListNode(int data){
            this.data = data;
        }
    }

    public CreateCircularSLL(){
        last = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void createCircular(){
        ListNode first = new ListNode(5);
        ListNode second = new ListNode(14);
        ListNode third = new ListNode(7);
        ListNode fourth = new ListNode(20);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;
    }

    public void display(){
        if(last == null){
            return;
        }
        ListNode first = last.next;
        while(first != last){
            System.out.print(first.data + " ");
            first = first.next;
        }
        System.out.println(first.data + " ");
    }


    public static void main(String[] args){
        CreateCircularSLL CSLL = new CreateCircularSLL();
        CSLL.createCircular();

        CSLL.display();
    }
}
