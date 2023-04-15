import java.util.Scanner;
import java.util.*;
import java.io.*;




public class tables {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER NUMBER ");
        int N=sc.nextInt();
        int i;
        for( i=1;i<=10;i++)
        {
            //N=N*i;
            int result=N*i;
            System.out.println(N+" X "+i+" = "+result);
            
        }
        i=+1;
    }
}
