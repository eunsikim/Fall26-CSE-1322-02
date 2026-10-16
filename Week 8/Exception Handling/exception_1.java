import java.util.Scanner;

public class exception_1 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        // int[] my_numbers = new int[3];

        // int index = 0;

        // while(true){
        //     System.out.print("Enter a number: ");
        //     my_numbers[index] = sc.nextInt();
        //     index++;
        // }

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter a number: ");
        int num2 = sc.nextInt();

        System.out.println(num1 / num2);
    }
}
