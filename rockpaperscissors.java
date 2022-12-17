import java.util.Scanner;

import java.util.Random;
//0 rock 1 paper 2 scissor
public class rockpaperscissors
{
    public static void main(String[] args)
    {
        
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter input");
    int playerinput=sc.nextInt();
    
    Random random=new Random(); 
    int compuinput=random.nextInt(3);

    if(playerinput==compuinput)
    {
    
        System.out.println("DRAW");
        System.out.println("Computer Input="+ compuinput);
        
    }
    else if(playerinput==0 && compuinput==2 || playerinput==1 && compuinput==0 || playerinput==2 && compuinput==1 )
    {
        
        System.out.println("Player WINS");
        System.out.println("Computer Input="+ compuinput);

        
    }
    else if(playerinput==2 && compuinput==0 || playerinput==0 && compuinput==1 || playerinput==1 && compuinput==2 )
    { 
        
        System.out.println("Computer WINS");
        System.out.println("Computer Input="+ compuinput);

    }


    }

    


}