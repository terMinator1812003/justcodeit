//algorithm 

//for(i=2;i<n;i++)
// //{
//     if(a[i])
//     {
//         for(ji*i;j<n;j+i)
//         {
//             if(a[i])
//             {
//                 a[i]=F
//             }
//         }
//     }
// }

public class prime {
    public static void main(String args[]){
        int i =0;
       int num =0;
       //Empty String
       String  primeNumbers = "";

       for (i = 1; i <= 50; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("Prime numbers from 1 to 50 are :");
       System.out.println(primeNumbers);
    }
    
}
