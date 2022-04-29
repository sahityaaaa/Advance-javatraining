
import java.util.HashSet;
import java.util.Scanner;

public class FirstRepeatElements {
	static void printFirstRepeating(int a[])
    {
        int m = -1;
 
        HashSet<Integer> set = new HashSet<>();
        for (int i=a.length-1; i>=0; i--)
        {
            if (set.contains(a[i]))
                m = i;
            else 
                set.add(a[i]);
        }
        if (m != -1)
          System.out.println("The first repeating element is " + a[m]);
        else
          System.out.println("No repeating elements");
    }
    public static void main (String[] args) throws java.lang.Exception
    {
    	 Scanner s = new Scanner(System.in);
    	 System.out.println("enter length of array : ");
    	int[] arr = new int[s.nextInt()];
        System.out.println("enter array values : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
         }
        printFirstRepeating(arr);
    }
}
