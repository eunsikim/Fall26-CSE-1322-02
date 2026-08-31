import java.util.Scanner;

public class if_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int my_number = sc.nextInt();

        if(my_number == 3){
            System.out.println(my_number + " is equal to 3");
        }
        else if(my_number ==  4){
            System.out.println(my_number + " is equal to 4");
        }
        else if(my_number == 5){
            System.out.println(my_number + " is equal to 5");
        }
        else{
            System.out.println("I do not know that number");
        }
    }
}
