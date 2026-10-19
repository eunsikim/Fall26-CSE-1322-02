import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class reading_1 {
    public static void main(String[] args) {
        try{
            File the_file = new File("hello_world.txt");

            Scanner sc = new Scanner(the_file);

            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
