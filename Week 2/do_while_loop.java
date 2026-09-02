import java.util.Scanner;

public class do_while_loop {
    public static void main(String[] args) {
        // Post-Condition Check Loop
        Scanner sc = new Scanner(System.in);
        char continue_ = 'N';

        do{
            System.out.print("Do you want to continue? (Y/N): ");
            continue_ = sc.next().charAt(0);
        }
        while(continue_ != 'N');
    }
}
