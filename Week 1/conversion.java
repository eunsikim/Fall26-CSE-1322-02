public class conversion {
    
    public static void main(String[] args) {

        String classname = "CSE 1321";
        String num_str = "10";

        int num_int = Integer.parseInt(num_str);

        System.out.println(num_int);

        double num_1 = 3.14;

        // We can use casting to convert between primitive types
        float num_2 = (float)num_1;
    }
}
