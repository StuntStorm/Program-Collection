package SinglyLinkedList;

public class RemoveLoopFromSLL {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void StartingPointofLoop() {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while (fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if(fastPtr == slowPtr){
                removeLoop(slowPtr);
            }
        }
    }

    private void removeLoop(ListNode slowPtr) {
        ListNode temp = head;
        while(slowPtr.next != temp.next){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        slowPtr.next = null;
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
        RemoveLoopFromSLL sll = new RemoveLoopFromSLL();
        sll.createLoopLinkedList();
        //sll.display();
        sll.StartingPointofLoop();
        sll.display();


    }
}
