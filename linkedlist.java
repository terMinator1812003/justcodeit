//without using collection api
class Node         //We are defining a node  here
    {
        public int data;       //data of node here
        Node next;      //next refers to the address of the next node
        
    }
public class linkedlist
{
    
    public static void main(String args[])
    {
        Node newnode1=new Node();    //here we are making objects of class Node
        Node newnode2=new Node();    //basically these are nodes of first linkedlist
        Node newnode3=new Node();    
        Node newnode4=new Node();    
        newnode1.data=1;
        newnode2.data=2;
        newnode3.data=3;
        newnode4.data=4;
         
          
        newnode1.next=newnode2;       //here we are linking the previous node to the next node of the list 
        newnode2.next=newnode3;
        newnode3.next=newnode4;
        newnode4.next=null;

        //Now we will print the linked list

       for (int i=1;i<=4;i++)
        {
            System.out.print(newnode1.data+" ");
            newnode1=newnode1.next;       //we are assigning the next address of the linked list to the current address 
        }
    }
}