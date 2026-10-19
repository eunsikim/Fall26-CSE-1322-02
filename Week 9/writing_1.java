import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class writing_1 {
    public static void main(String[] args) {
        File the_file;

        PrintWriter pw = null;

        try{
            the_file = new File("lorem_ipsum.txt");

            pw = new PrintWriter(the_file);

            pw.print("Nonsense");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            if(pw != null){
                pw.close();
            }
        }
    }
}
