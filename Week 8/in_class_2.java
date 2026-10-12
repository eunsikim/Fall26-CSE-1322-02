// Create a recursive function that checks
// if a String contains a specific character

public class in_class_2 {
    public static boolean find(String s, char c){
        if(s.isEmpty()){
            return false;
        }
        else if(s.charAt(0) == c){
            return true;
        }

        return false || find(s.substring(1), c);
    }

    public static void main(String[] args) {
        System.out.println(find("hello", 'e'));
        System.out.println(find("hello", 'a'));
    }
}
