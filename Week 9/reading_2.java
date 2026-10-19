import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class reading_2 {
    public static void main(String[] args) {
        try(BufferedReader bf = new BufferedReader(new FileReader("lorem_ipsum.txt"))){
            while(true){
                String line = bf.readLine();

                if(line != null){
                    System.out.println(line);
                }
                else{
                    break;
                }
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
