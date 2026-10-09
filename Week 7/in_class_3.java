// Create a recursive function that takes in a string
// and returns the string in reverse
//
// The function will return a String and it will
// build the returning reversed string on each
// recursion call.
//
// Sample Output if we call f("Hello")
// should return "olleH"

public class in_class_3 {
    public static String print_reverse(String s){
        if(s.isEmpty()){
            return "";
        }

        return print_reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(print_reverse("Hello World"));
    }
}
