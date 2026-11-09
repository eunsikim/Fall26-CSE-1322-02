class node{
    node next;
    node prev; 
    // As you will notice, a doubly linked list
    // will simplify some operations, but will add
    // some more overhead since any time a node
    // is added or removed we must handle the
    // next pointer and the previous pointer.

    int data;

    public node(int data){
        this.data = data;
        next = null;
        prev = null;
    }
}

class linked_list{
    node head;

    public linked_list(){
        head = null;
    }

    // Add at the beginning
    public void add_first(int data){
        node new_node = new node(data);
        
        if(head == null){
            head = new_node;
            return;
        }

        new_node.next = head;
        head.prev = new_node; // The old head now point backwards to the new node
        head = new_node;
    }

    // Add at the end
    public void add_last(int data){
        node new_node = new node(data);
        
        if(head == null){
            head = new_node;
            return;
        }

        // Traverse the entire linked list
        for(node current = head; current != null; current = current.next){
            if(current.next == null){
                current.next = new_node; // The last node now points towards the new node
                new_node.prev = current; // The new node now points backwards to the second to last node.
                return;
            }
        }
    }

    // Remove first node
    public void remove_first(){
        // Linked List contains no nodes
        if(head == null){
            System.out.println("Linked List is empty.");
            return;
        }
        // Linked List contains one node
        else if(head.next == null){
            head = null;
            return;
        }

        head = head.next; // Head (old) is re-assigned to the second node (new head) in the list.
        // This step is optional because of Java Garbage Collector, but it is a good practice:
        head.prev.next = null; // The old Head is still pointing towards the new head, so we use the previous pointer to set this to null
        head.prev = null; // Re-assigning the new head previous pointer to null (old head is completely removed)
    }

    // Remove last node
    public void remove_last(){
        // Linked List contains no nodes
        if(head == null){
            System.out.println("Linked List is empty.");
            return;
        }
        // Linked List contains one node
        else if(head.next == null){
            head = null;
            return;
        }

        // Traverse the entire linked list
        for(node current = head; current != null; current = current.next){
            if(current.next == null){
                current.prev.next = null;
                current.prev = null;
            }
        }
    }

    // Print Linked List
    public void print(){
        for(node current = head; current != null; current = current.next){
            System.out.println(current.data);
        }
    }
}

public class doubly_linked_list {
    public static void main(String[] args) {
        linked_list myLinked_list = new linked_list();

        myLinked_list.add_first(10);
        myLinked_list.add_last(0);
        myLinked_list.add_last(11);

        myLinked_list.print();
        System.out.println();
        
        myLinked_list.remove_first();
        myLinked_list.remove_last();
        myLinked_list.print();
    }
}
