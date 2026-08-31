public class boolean_exp {
    public static void main(String[] args) {
        // Comparison Ops are still the same as in Python
        System.out.println(3 == 3);
        System.out.println(3 != 4);
        System.out.println(3 > 3);
        System.out.println(3 >= 3);

        // Logical Ops
        // NOT (!)
        System.out.println(!(3 == 3));

        // AND (&&)
        System.out.println(3 == 3 && 3 >= 3);
        System.out.println(3 == 4 && 3 >= 3);
        System.out.println(3 == 4 && 3 >= 4);

        // OR (||)
        System.out.println(3 == 3 || 3 >= 3);
        System.out.println(3 == 4 || 3 >= 3);
        System.out.println(3 == 4 || 3 >= 4);
    }
}
