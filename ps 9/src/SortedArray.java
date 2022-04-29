

public class SortedArray {
	static void printFreq(int a[], int n)
    {
        int frequency= 1;       
        for (int i = 1; i < n; i++) {
            if (a[i] == a[i - 1]) {
                frequency++;
            }           
            else {
                System.out.println(a[i - 1]+" occurs "+frequency+ " times ");  
                frequency = 1;
            }
        }       
        System.out.println( a[n- 1]+" occurs "+frequency+" times " );
    }
    public static void main(String args[])
    {   
        int arr[]
            = {2,2,2,4,4,4,5,5,6,8,8,9};
        int N = arr.length;       
        printFreq(arr, N);
    }

}
