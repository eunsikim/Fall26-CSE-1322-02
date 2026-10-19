import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class writing_2 {
    public static void main(String[] args) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("output_2.txt", true))){
            bw.write("\nNonsense!");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
