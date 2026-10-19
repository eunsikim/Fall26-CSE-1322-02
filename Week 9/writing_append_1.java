import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class writing_append_1 {
    public static void main(String[] args) {
        File the_file;

        PrintWriter pw = null;

        try{
            the_file = new File("lorem_ipsum.txt");

            FileOutputStream fos = new FileOutputStream(the_file, true);

            pw = new PrintWriter(fos);

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
