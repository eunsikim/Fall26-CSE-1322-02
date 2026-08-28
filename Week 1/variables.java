public class variables {
    public static void main(String[] args) {
        float rate = 0.05f;

        // byte age = 128; // This is not possible because bytes can only represent [-128, 127]

        String message = "Hello World".toLowerCase() + rate;

        String message_2 = "Hello world".toLowerCase();

        System.out.println(message + " " + message_2);
        System.out.println(message + " " + rate);
    }
}
