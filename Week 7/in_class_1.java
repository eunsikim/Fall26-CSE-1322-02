// Develop a recursive function that
// takes in a number and prints out 
// a sequence of numbers starting from
// 1 to the number passed in the original
// /first function call

// If I do my_recursive_fn(5)
//
// Output:
// 1
// 2
// 3
// 4
// 5

public class in_class_1 {
    // Approach #1
    static int doRecurse(int last) {
        int val = (last > 1) ? doRecurse(last - 1) : last;

        System.out.println(val);

        return last + 1;
    }

    // Approach #2
    static void doRecurse_2(int x){
        if(x == 0){
            return;
        }

        doRecurse_2(x - 1);

        System.out.println(x);
    }

    public static void main(String[] args) {
        doRecurse(5);
    }
}
