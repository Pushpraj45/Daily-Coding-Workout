//{ Driver Code Starts
import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			new Solution().quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }
// } Driver Code Ends


class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int start, int end)
    {
        // code here
        if(start<end){
            int pidx = partition(arr, start, end);
            quickSort(arr, start, pidx-1);
            quickSort(arr, pidx+1, end);
        }
    }
    static int partition(int arr[], int start, int end)
    {
        // your code here
        int pivot = arr[end];
        int i=start-1;
        for(int j=start; j<end; j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[end] =temp;
        return i;
    } 
}
