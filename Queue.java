package Queue;

import java.util.NoSuchElementException;

public class Queue {
    private ListNode front;
    private ListNode rear;
    private int lenght;

    private class ListNode{
        private ListNode next;
        private int data;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Queue () {
        this.front = null;
        this.rear = null;
        this.lenght =0;
    }

    public int length(){
        return lenght;
    }

    public boolean isEmpty() {
        return lenght==0;
    }

    public void Enqueue(int data){
        ListNode temp = new ListNode(data);
        if(isEmpty()){
            front = temp;
        }else{
            rear.next = temp;
        }
        rear = temp;
        lenght++;
    }
    public int Dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        int result = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        lenght--;
        return result;
    }

    public void printQueue(){
        if(isEmpty()){
            return;
        }
        ListNode current = front;
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        Queue queue = new Queue();

        queue.Enqueue(10);
        queue.Enqueue(13);
        queue.Enqueue(23);
        queue.Enqueue(40);

        queue.Dequeue();
        queue.Dequeue();
        queue.printQueue();
    }
}
