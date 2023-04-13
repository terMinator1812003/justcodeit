import java.io.Console;

public class Question_02 {

    public static void main(String args[]) {
        // Console is a class of java.util package
        Console con = System.console();
        System.out.println("Enter Your City Name "); 
        /*

         * which takes input from keyboard
         */
        String city = con.readLine();  
        System.out.println("City name : "+city );    
    }
}
          
    