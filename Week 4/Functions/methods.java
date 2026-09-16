import java.util.Scanner;

public class methods {
    static String text = "Hello";
    public static void hello_world(){
        System.out.println("HELLO WORLD");
    }
    public static boolean is_even(int number){
        return number % 2 == 0; // We have to return a boolean value/expression
    }

    public static void print(String prompt){
        System.out.println(prompt);
        return; // The return statement can be used in a void type return function
        // It will just "break" out of the function.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        print("Enter a number: ");
        int number = sc.nextInt();

        if(is_even(number)){
            print("The number is even");
        }
        else{
            print("The number is odd");
        }

        hello_world();

        System.out.println(text);
    }
}
