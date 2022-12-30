public class MergeSort{
    public static void conquer(int arr[] ,int si,int mid,int ei){
        //we have create a new array to save merge array
        int merged[]=new int[ei-si+1];

        //now we will start putting elements in merged array
        //so we have create two index one from si and one from mid
        
        int idx1=si;//track one array 
        int idx2=mid+1;//track second array
        int x=0;//track merged array

        while(idx1 <= mid && idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
                merged[x++]=arr[idx1++];

            }
            else{
                merged[x++]=arr[idx2++];

            }//to sort an element
        
        }
        //to add already sort ed element
        while(idx1 <= mid ){
            merged[x++]=arr[idx1++];
        }
        while( idx2<=ei){
            merged[x++]=arr[idx2++];
        }

        //copy to original array from merged array
        for(int i=0, j=si;i<merged.length ; i++ , j++){
            arr[j]=merged[i];
        }

    }   

    //  function is to divide the  array 
    public static void divide(int arr[],int si,int ei)//si=starting index and ei=ending index
    {   
        if(si>=ei){//this will return if we have perform all operations or array is ended
            return;
        }
        int mid=si +(ei-si)/2;//why not (si+ei)/2 if by chance both values are greater it may come out of 
        // the int so there may occur space complexity or sometimes
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
    }
    public static void main(String args[]){
        int arr[]={6,3,95,2,8};
        int n=arr.length;
        divide(arr, 0 ,n-1);
        //print array
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
}