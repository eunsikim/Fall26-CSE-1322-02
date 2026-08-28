import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("What year were you born?: ");
        int year = sc.nextInt();

        int age = 2026 - year;

        System.out.println("Your name is " + name);
        System.out.println("You are " + age + " years old");

        System.out.print("Do you like this program (Y/N)");
        char like = sc.next().charAt(0);

        if(like == 'Y'){
            System.out.println("Thank you!");
        }
        else{
            System.out.println("Bye!");
        }
    }
}
