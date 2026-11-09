class node{
    node next;
    int data;

    public node(int data){
        next = null;
        this.data = data;
    }
}

class LinkedListQueue{
    node Head;

    public LinkedListQueue(){
        Head = null;
    }

    public void enqueue(int data){
        node new_node = new node(data);

        if(Head == null){
            Head = new_node;
            return;
        }
        
        for(node curr = Head; curr != null; curr = curr.next){
            if(curr.next == null){
                curr.next = new_node;
                return;
            }
        }
    }

    public int dequeue(){
        if(Head == null){
            System.out.println("Queue is Empty.");
            return -1;
        }

        int data = Head.data;
        Head = Head.next;
        return data;
    }

    public void print(){
        System.out.print("(H)");
        for(node current = Head; current != null; current = current.next){
            System.out.print(current.data + " -> ");
        }
        System.out.println("null");
    }
}

public class Queue_1 {
    public static void main(String[] args) {
        LinkedListQueue my_queue = new LinkedListQueue();

        my_queue.enqueue(10);
        my_queue.enqueue(20);
        my_queue.enqueue(30);

        my_queue.print();
    }
}
