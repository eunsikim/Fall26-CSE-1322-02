class node{
    node next;
    int data;

    public node(int data){
        next = null;
        this.data = data;
    }
}

class LinkedListStack{
    node Top;

    public LinkedListStack(){
        Top = null;
    }

    public void push(int data){
        node new_node = new node(data);

        if(Top == null){
            Top = new_node;
            return;
        }

        new_node.next = Top;
        Top = new_node;
    }

    public int peek(){
        if(Top == null){
            return -1;
        }

        return Top.data;
    }

    public int pop(){
        if(Top == null){
            return -1;
        }

        int data = Top.data;
        Top = Top.next;

        return data;
    }

    public void print(){
        System.out.println("(T)");
        for(node current = Top; current != null; current = current.next){
            System.out.println(current.data);
            System.out.println("V");
        }
        System.out.println("null");
    }
}

public class Stacks_1 {
    public static void main(String[] args) {
        LinkedListStack my_stack = new LinkedListStack();

        my_stack.push(10);
        my_stack.push(20);
        my_stack.push(30);
        my_stack.push(40);

        my_stack.print();
        System.out.println("Peeking...");
        System.out.println(my_stack.peek());
    }
}
