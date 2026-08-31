// Using If statements (If,Else If, Else or just Ifs)
// Create a program that asks the user's birth year
// and figure out if the user is eleigible to vote, drink, none of these options
// vote >= 18
// drink >= 21 

import java.util.Scanner;

public class in_class_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What year were you born: ");
        int year = sc.nextInt();

        int age = 2026 - year;

        if(age >= 21){
            System.out.println("You are elegible to drink and vote");
        }
        else if(age >= 18){
            System.out.println("You are elegible to vote but not drink");
        }
        else{
            System.out.println("You are not elegible to vote and not elegible to drink");
        }
    }
}
