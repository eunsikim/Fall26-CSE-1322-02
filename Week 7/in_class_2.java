// Create a recursive function that takes in a string
// and prints the string in reverse order and vertically
//
// Sample Output if we call f("Hello")
// o
// l
// l
// e
// H

public class in_class_2 {
    public static void print_reverse(String s){
        if(s.isEmpty()){
            return;
        }

        print_reverse(s.substring(1));

        System.out.println(s.charAt(0));
    }

    public static void main(String[] args) {
        print_reverse("hello");
    }
}
