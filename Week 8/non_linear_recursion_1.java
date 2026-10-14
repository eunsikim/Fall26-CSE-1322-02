public class non_linear_recursion_1 {
    public static void DoWork(int i){
        System.out.println(i);

        if(i > 2){
            DoWork(i - 1);
            DoWork(i - 2);
        }

        System.out.println(i);
    }
    public static void main(String[] args) {
        DoWork(4);
    }
}
