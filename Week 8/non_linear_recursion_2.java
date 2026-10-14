public class non_linear_recursion_2 {
    public static int fibo(int x){
        if(x == 0){
            return 0;
        }
        else if(x == 1){
            return 1;
        }

        return fibo(x - 1) + fibo(x - 2);
    }

    public static void main(String[] args) {
        // System.out.println(fibo(0));
        // System.out.println(fibo(1));
        // System.out.println(fibo(2));
        // System.out.println(fibo(3));
        // System.out.println(fibo(4));
        System.out.println(fibo(5));
        // System.out.println(fibo(6));
    }
}
