class node{
    node next; // Arm of the stick figure
    int data;

    public node(int data){
        this.data = data;
        next = null;
    }
}

class linked_list{
    node Head;

    public linked_list(){
        Head = null;
    }

    public void add_last(int data){
        node new_node = new node(data);

        // If the linked list is empty
        if(Head == null){
            Head = new_node;
        }
        // If we have at least one node in the linked list
        else{
            node current = Head;

            while(current.next != null){
                current = current.next;
            }

            current.next = new_node;
        }
    }

    public void add_first(int data){
        node new_node = new node(data);

        new_node.next = Head;
        Head = new_node;
    }

    public void print(){
        System.out.print("(H)");
        for(node current = Head; current != null; current = current.next){
            System.out.print(current.data + " -> ");
        }
        System.out.println("null");
    }
}

public class Linked_Lists_1 {
    public static void main(String[] args) {
        linked_list my_linked_list = new linked_list();

        my_linked_list.add_last(10);
        
        my_linked_list.print();
        
        my_linked_list.add_last(15);

        my_linked_list.print();

        my_linked_list.add_last(20);
        
        my_linked_list.print();

        my_linked_list.add_last(8);
        
        my_linked_list.print();
        
        my_linked_list.add_first(0);
        
        my_linked_list.print();
    }
}
