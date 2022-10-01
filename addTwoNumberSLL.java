package SinglyLinkedList;

public class addTwoNumberSLL {
    ListNode head;

    private static class ListNode {
        private int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public static ListNode additionTwoSll(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;
        while(a != null || b != null){
            int x = (a != null) ? a.data : 0;
            int y = (b != null) ? b.data : 0;
            int sum = carry + x + y;
            carry = sum/10;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;
            if (a != null) a = a.next;
            if (b != null) b = b.next;
        }
        if (carry > 0){
            tail.next = new ListNode(carry);
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        addTwoNumberSLL SLL1 = new addTwoNumberSLL();
        SLL1.insertLast(7);
        SLL1.insertLast(4);
        SLL1.insertLast(9);
        SLL1.display();

        addTwoNumberSLL SLL2 = new addTwoNumberSLL();
        SLL2.insertLast(5);
        SLL2.insertLast(6);
        SLL2.display();


        addTwoNumberSLL result = new addTwoNumberSLL();
        result.head = additionTwoSll(SLL1.head, SLL2.head);

        result.display();


    }
}
