import java.util.ArrayList;

public class ArrayList_type {
    public static void main(String[] args) {
        // We cannot use primitive types, we can only use 
        // complex data type.
        // So, to create an array list of integers, we must use
        // the `Integer` wrapper class
        ArrayList<Integer> my_numbers = new ArrayList<>();
        
        // Other wrapper classes:
        // int => Integer
        // float => Float
        // char => Character
        
        my_numbers.add(1);
        my_numbers.add(3);
        my_numbers.add(5);

        System.out.println(my_numbers.get(1));

        // We cannot change values with the get()
        // instead we use set()
        // 1st argument is the index position
        // 2nd argument is the "new" value
        my_numbers.set(1, 4);

        System.out.println(my_numbers.get(1));

        System.out.println();

        // Iterating by Value
        for(Integer x : my_numbers){
            System.out.println(x);
        }

        System.out.println();
        
        for(int x : my_numbers){
            System.out.println(x);
        }

        System.out.println();

        // Iterating by Index
        for(int i = 0; i < my_numbers.size(); i++){
            System.out.println(i + ". " + my_numbers.get(i));
        }

        System.out.println();

        my_numbers.remove(1);

        for(int i = 0; i < my_numbers.size(); i++){
            System.out.println(i + ". " + my_numbers.get(i));
        }

        my_numbers.clear();

        if(my_numbers.isEmpty()){
            System.out.println("ArrayList is empty");
        }
        else{
            System.out.println("ArrayList is not empty");
        }
    }
}
