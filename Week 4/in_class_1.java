// Create function that takes 2 parameters (Username and Password both strings)
// and validate if they match the username "admin" and password "password123"
// if the login is successful, it should return true or false

// In the main program, create a loop that keeps looping until the login is successful.

import java.util.Scanner;

public class in_class_1 {
    public static boolean login(String username, String password){
        return username.equals("admin") && password.equals("password123");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = "";
        String password = "";
        do{
            System.out.print("username: ");
            username = sc.nextLine();
            System.out.print("password: ");
            password = sc.nextLine();

        }while(!login(username, password));

        System.out.println("Login Successful");
    }
}
