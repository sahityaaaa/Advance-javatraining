
public class Platforms{ 
public static int platform(int arr1[], int dep[],
            int n)
{

// plat_needed indicates number of platforms
// needed at a time
int plat_needed = 1, result = 1;
int i = 1, j = 0;

// run a nested  loop to find overlap
for (i = 0; i < n; i++) {
// minimum platform
plat_needed = 1;

for (j = i + 1; j < n; j++) {
// check for overlap
if ((arr1[i] >= arr1[j] && arr1[i] <= dep[j])
|| (arr1[j] >= arr1[i]
 && arr1[j] <= dep[i]))
plat_needed++;
}

// update result
result = Math.max(result, plat_needed);
}

return result;
}

// Driver Code
public static void main(String[] args)
{
int a[] = { 900, 940, 950, 1100, 1500, 1800 };
int s[] = { 910, 1200, 1120, 1130, 1900, 2000 };
int n = 6;
System.out.println("Minimum No.of Platforms Required = "+platform(a, s, n));
}
}
