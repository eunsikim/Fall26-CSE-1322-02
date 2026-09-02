// Prompt the user for 10 quiz grades
// USE LOOPS (any kind)
// Print out the average quiz grade 
import java.util.Scanner;

public class in_class_ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum_quiz_grade = 0;

        for(int i = 0; i < 10; i++){
            System.out.print("Enter grade for quiz " + (i + 1) + ": ");
            sum_quiz_grade += sc.nextDouble();
        }

        double quiz_avg = sum_quiz_grade / 10;

        System.out.println("Quiz average is " + quiz_avg);
    }
}
