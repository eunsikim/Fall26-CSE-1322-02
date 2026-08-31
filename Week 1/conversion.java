public class conversion {
    
    public static void main(String[] args) {

        String classname = "CSE 1321";
        String num_str = "10";

        // Converting String to a primitive type
        int num_int = Integer.parseInt(num_str);
        double num_double = Double.parseDouble("3.14");

        // Converting primitive type to String
        String num_str_2 = Integer.toString(24);
        String num_str_3 = Double.toString(3.14);

        System.out.println(num_int);

        double num_1 = 3.14;

        // We can use casting to convert between primitive types
        float num_2 = (float)num_1;

        

    }
}
