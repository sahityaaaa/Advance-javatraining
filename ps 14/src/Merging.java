
import java.util.Arrays;

public class Merging {
	public static void sortedMerge(int a[], int b[],
            int res[], int n,
            int m)
{
		
int i = 0, j = 0, k = 0;
while (i < n) {
res[k] = a[i];
i++;
k++;
}

while (j < m) {
res[k] = b[j];
j++;
k++;
}


Arrays.sort(res);
}


public static void main(String[] args)
{
int a[] = { 51,9,32,54,12,67 };
int b[] = { 89,45,32,41,40,105 };
int n = a.length;
int m = b.length;


int r[]=new int[n + m];
sortedMerge(a, b, r, n, m);

System.out.print("Sorted merged list :");
for (int i = 0; i < n + m; i++)
System.out.print(" " + r[i]);
}
}
