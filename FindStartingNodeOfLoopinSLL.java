package SinglyLinkedList;

public class FindStartingNodeOfLoopinSLL {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public ListNode StartingPointofLoop() {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while (fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if(fastPtr == slowPtr){
                return getStartingNode(slowPtr);
            }
        }
        return null;
    }

    private ListNode getStartingNode(ListNode slowPtr) {
        ListNode temp = head;
        while(slowPtr != temp){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return temp;  //this is the first node of the loop
    }


    public void createLoopLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = second;
    }

    public void display() {
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        FindStartingNodeOfLoopinSLL sll = new FindStartingNodeOfLoopinSLL();

        sll.createLoopLinkedList();

        System.out.println("First node of the loop is : " + sll.StartingPointofLoop().data);


    }
}
