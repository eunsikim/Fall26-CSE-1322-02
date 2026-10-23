import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class openweather {
    public static void main(String[] args) {
        String HOST = "api.openweathermap.org";
        int PORT = 80;
        String API_KEY = "a8c74e397547af1e5af88b8ae0bea1e0";
        String REQUEST_PATH = "/data/2.5/weather?q=Atlanta&units=imperial&appid=" + API_KEY;

        try(
            Socket socket = new Socket(HOST, PORT);
            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            Scanner sc = new Scanner(socket.getInputStream());
        ){
            pw.print("GET " + REQUEST_PATH + " HTTP/1.1\r\n");
            pw.print("Host: " + HOST + "\r\n");
            pw.print("Connection: close\r\n");
            pw.print("\r\n");
            pw.flush();

            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
