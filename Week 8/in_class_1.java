// Develop a recursive function that counts how many
// characters there is in a String

public class in_class_1 {
    public static int count_chars(String s){
        if(s.length() == 1){
            return 1;
        }

        return count_chars(s.substring(1)) + 1;
    }

    public static void main(String[] args) {
        System.out.println(count_chars("asd"));
    }
}
