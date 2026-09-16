public class overloaded_functions {
    // In Java we can have functions with the same name
    // The only requirement is that the `Signature` of the function
    // must be unique:
    // 1. # of parameters
    // 2. Data type of parameters
    // 3. Order of the parameters and data type
    public static void print(String prompt){
        System.out.println(prompt);
    }

    public static void print(String prompt, String end){
        System.out.print(prompt + end);
    }

    public static int add(int n1, int n2){
        print("add(int, int)");
        return n1 + n2;
    }

    public static float add(float n1, float n2){
        print("add(float, float)");
        return n1 + n2;
    }

    public static float add(float n1, int n2){
        print("add(float, int)");
        return n1 + n2;
    }

    public static float add(int n1, float n2){
        print("add(int, float)");
        return n1 + n2;
    }

    
    public static void main(String[] args) {
        print("Hello");
        print("World");

        print("Hello", ", ");
        print("CSE 1321");

        print(Integer.toString(add(3, 4)));
        print(Float.toString(add(3.4f, 5.0f)));
        print(Float.toString(add(3.4f, 5)));
        print(Float.toString(add(5, 3.4f)));
    }
}
