
import java.util.Scanner;
import java.util.Vector;

public class Coin {
	static int a[] = {1,2,5,10,20,50,100,500,2000};
    static int n = a.length;

    static void findMin(int V)
    {
    	int count=0;
        Vector<Integer> ans = new Vector();
  
        for (int i = n - 1; i >= 0; i--)
        {
            while (V >= a[i]) 
            {
                V -= a[i];
                ans.add(a[i]);
                count++;

            }
        }
        System.out.print(count+". Break Down-");
        for (int i = 0; i < ans.size(); i++)
        {
            System.out.print(
                " Rs." + ans.elementAt(i)+"*1");
            if(i<1) {
            	System.out.print(" +");
            }
        }
    }
  
    public static void main(String[] args) 
    {
    	System.out.println("enter any number :");
    	Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        findMin(n);
    }
}
