public class recursion_2 {
    public static int factorial(int x){
        // Usually, when the base case is based on a numeric
        // data type, we evaluate this value to be either 0 
        // or 1.
        if(x == 1){
            return 1;
        }
        
        return factorial(x - 1) * x;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
