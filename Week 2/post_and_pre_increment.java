public class post_and_pre_increment {
    public static void main(String[] args) {
        int count = 0;

        // Post-Increment x++
        System.out.println(count++);
        
        System.out.println(count++);
        
        System.out.println(count++);

        // Pre-Increment ++x
        System.out.println(++count);

        // Post-Decrement x--
        System.out.println(count--);

        // Pre-Decrement --x
        System.out.println(--count);
    }
}
