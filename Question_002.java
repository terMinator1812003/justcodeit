import java.io.*;

public class Question_002 {

    public static void main(String args[]) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter Birthday Month");
        String month = br.readLine();
        System.out.println(" Birthday Month is  " + month);
    }
}
