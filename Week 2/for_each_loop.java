public class for_each_loop {
    public static void main(String[] args) {
        String message = "Hello CSE 1322";

        for(char c : message.toCharArray()){
            System.out.println(c);
        }
    }
}
