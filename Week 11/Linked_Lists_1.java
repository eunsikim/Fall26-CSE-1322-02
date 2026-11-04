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

    // Create a function called "exists()" that takes an integer value.
    // Then, the function iterates through the linked list and returns 
    // a boolean value `true` if the parameter exists in the Linked List 
    // or `false` otherwise.
    public boolean exists(int data){
        for(node curr = Head; curr != null; curr = curr.next){
            if(curr.data == data){
                return true;
            }
        }

        return false;
    }

    public void delete(int value){
        if(Head == null){
            System.out.println("The list is empty");
            return;
        }

        node current = Head;

        while(current.next != null && current.next.data != value){
            current = current.next;
        }

        if(current.next == null){
            System.out.println("The value " + value + " does not exists in the link list.");
            return;
        }
        
        System.out.println("Deleting " + value);
        current.next = current.next.next;
        print();
    }

    public void delete_first(){
        if(Head == null){
            System.out.println("The list is empty!");
            return;
        }

        Head = Head.next;
        print();
    }

    // Write a function that deletes the last node
}

public class Linked_Lists_1 {
    public static void main(String[] args) {
        linked_list my_linked_list = new linked_list();

        my_linked_list.delete_first();

        my_linked_list.add_last(10);
        
        my_linked_list.print();
        
        my_linked_list.add_last(15);

        my_linked_list.print();

        my_linked_list.add_last(20);
        
        my_linked_list.print();

        my_linked_list.add_last(15);
        
        my_linked_list.print();

        my_linked_list.add_last(8);
        
        my_linked_list.print();
        
        my_linked_list.add_first(0);
        
        my_linked_list.print();
        
        System.out.println(my_linked_list.exists(20));
        System.out.println(my_linked_list.exists(100));
        
        my_linked_list.add_last(100);
        System.out.println(my_linked_list.exists(100));
        my_linked_list.print();

        my_linked_list.delete(15);
        my_linked_list.delete(15);
        
        my_linked_list.delete_first();
    }
}
