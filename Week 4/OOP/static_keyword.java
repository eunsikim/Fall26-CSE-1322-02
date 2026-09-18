public class static_keyword {
    // We use the `static` keyword to define what belongs
    // to the class.

    // By default, non-static attributes and functions
    // belong to the object.
    public static void print_hello(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        print_hello();
    }
}
