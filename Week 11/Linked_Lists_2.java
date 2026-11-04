class node{
    node next; // Arm of the stick figure
    node prev;
    int data;

    public node(int data){
        this.data = data;
        next = null;
        prev = null;
    }
}

class linked_list{
    node Head;

    public linked_list(){
        Head = null;
    }

    public void add_last(int data){

    }

    public void add_first(int data){

    }

    public void print(){

    }

    public boolean exists(int data){
        
    }

    public void delete(int value){
        
    }

    public void delete_first(){
        
    }

    // Write a function that deletes the last node
}

public class Linked_Lists_2 {
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
