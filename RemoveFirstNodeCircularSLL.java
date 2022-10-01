package CircularSinglyLinkedList;

import java.util.NoSuchElementException;

public class RemoveFirstNodeCircularSLL {
    private ListNode last;
    private int length;

    private class ListNode{
        private ListNode next;
        private int data;

        public ListNode(int data){
            this.data = data;
        }
    }

    public RemoveFirstNodeCircularSLL(){
        last = null;
        length = 0;
    }

    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }

    public void createCircularList(){
        ListNode first = new ListNode(10);
        ListNode second = new ListNode(4);
        ListNode third = new ListNode(6);

        first.next = second;
        second.next = third;
        third.next = first;

        last = third;
        length = 3;
    }

    public ListNode deleteFirstNode(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = last.next;
        if(last.next == last){
            last = null;
        }else{
            last.next = temp.next;
        }
        temp.next = null;
        length--;
        return temp;
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
        System.out.println(first.data);
    }


    public static void main(String[] args){
        RemoveFirstNodeCircularSLL csll = new RemoveFirstNodeCircularSLL();
        csll.createCircularList();

        csll.deleteFirstNode();

        csll.display();

    }
}
