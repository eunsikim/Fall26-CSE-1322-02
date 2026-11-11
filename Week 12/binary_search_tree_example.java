class node{
    node right;
    node left;

    int data;

    public node(int data){
        this.data = data;
        right = null;
        left = null;
    }
}

class BST{
    node root;

    public BST(){
        root = null;
    }

    public void add(int data){
        node new_node = new node(data);

        root = add(root, new_node);
    }

    public node add(node current, node new_node){
        if(current == null){
            return new_node;
        }
        else if(current.data > new_node.data){
            current.left = add(current.left, new_node);
        }
        else if(current.data < new_node.data){
            current.right = add(current.right, new_node);
        }

        return current;
    }

    public void print(){
        print(root);
    }

    public void print(node current){
        if(current == null){
            return;
        }

        print(current.left);
        System.out.println(current.data);
        print(current.right);
    }
}

public class binary_search_tree_example {
    public static void main(String[] args) {
        BST my_bst = new BST();

        my_bst.add(20);
        my_bst.add(15);
        my_bst.add(50);
        my_bst.add(35);

        my_bst.print();
    }
}
