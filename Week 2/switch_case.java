import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int my_number = sc.nextInt();

        switch(my_number){
            case 3:
                System.out.println(my_number + " is equal to 3");
                break;
            case 4:
                System.out.println(my_number + " is equal to 4");
                break;
            case 5:
                System.out.println(my_number + " is equal to 5");
                break;
            default:
                System.out.println("I do not know that number");
                break;
        }
    }
}
