import java.util.InputMismatchException;
import java.util.Scanner;

class NumberIDoNotLikeException extends Exception{
    public NumberIDoNotLikeException(String error_message){
        super(error_message);
    }
}

public class try_catch {
    public static void check_if_I_like_that_number(int x) throws NumberIDoNotLikeException{
        if(x == 3){
            throw new NumberIDoNotLikeException("I do not like the number '2+1'");
        }
        else if(x > 40){
            throw new NumberIDoNotLikeException("I do not like any numbers above '39+1'");
        }
    }

    public static void main(String[] args) {
        while(true){
            try{
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a number or enter -1 to stop: ");
                int num1 = sc.nextInt();
                check_if_I_like_that_number(num1);

                if(num1 == -1){
                    break;
                }
                
                System.out.print("Enter a number: ");
                int num2 = sc.nextInt();

                check_if_I_like_that_number(num2);

                int division = num1 / num2;

                check_if_I_like_that_number(division);

                System.out.println(division);
            }
            catch(ArithmeticException e){
                System.out.println("You cannot do division by zero, try again!");
            }
            catch(InputMismatchException e){
                System.out.println("Please enter a numeric value");
            }
            catch(NumberIDoNotLikeException e){
                System.out.println(e.getMessage());
            }
            catch(Exception e){
                System.out.println("Whatever you did, was not valid");
            }
            finally{
                System.out.println("Moving on into the next iteration...");
            }
        }

        System.out.println("Program Terminated");
    }
}
