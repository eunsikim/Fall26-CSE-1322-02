public class recursion_1 {
    public static void do_something(int x){
        // Base Case
        if(x == 0){
            return;
        }

        System.out.println(x);

        // Recursive Call: call `do_something()` inside of `do_something()`
        do_something(x - 1); // For this recursion to end, each succesive call must approach the base case, thus we decrease x by 1 so at some point it is 0.
    }
    public static void main(String[] args) {
        do_something(5);
    }
}