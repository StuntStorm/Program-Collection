package SinglyLinkedList;

public class mergeSortedSLL {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

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

    public static ListNode merge(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(a != null && b != null){
            if(a.data <= b.data){
                tail.next = a;
                a = a.next;
            }else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if(a == null){
            tail.next = b;
        }else{
            tail.next = a;
        }
        return dummy.next;
    }


    public static void main(String[] args) {
        mergeSortedSLL SLL1 = new mergeSortedSLL();
        SLL1.insertLast(1);
        SLL1.insertLast(3);
        SLL1.insertLast(5);
        SLL1.insertLast(6);
        SLL1.insertLast(8);
        SLL1.insertLast(11);

        mergeSortedSLL SLL2 = new mergeSortedSLL();
        SLL2.insertLast(2);
        SLL2.insertLast(4);
        SLL2.insertLast(6);
        SLL2.insertLast(9);

        SLL1.display();
        SLL2.display();

        mergeSortedSLL result = new mergeSortedSLL();
        result.head = merge(SLL1.head, SLL2.head);

        result.display();
    }
}
