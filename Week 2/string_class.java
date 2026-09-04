public class string_class {
    public static void main(String[] args) {
        // This is the traditional way to initialize a complex type object:
        String message = new String("Hello World");

        // But with strings we can initalize them like this:
        String message_2 = "hello World";

        System.out.println("Comparing with str.equals()");
        // str.equals() is case sensitive
        if(message.equals(message_2)){
            System.out.println(message + " is equal to " + message_2);
        }
        else{
            System.out.println(message + " is not equal to " + message_2);
        }

        System.out.println();

        System.out.println("Comparing with str.equalsIgnoreCase()");
        // str.equalsIgnoreCase() is case insensitive
        if(message.equalsIgnoreCase(message_2)){
            System.out.println(message + " is equal to " + message_2);
        }
        else{
            System.out.println(message + " is not equal to " + message_2);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message);

        for(char c : message.toCharArray()){
            System.out.println(c);
        }

        System.out.println(message.length());
    }
}
