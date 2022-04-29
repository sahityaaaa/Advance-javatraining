public class ClimbingStairs {
	static int f(int n)
    {
        if (n <= 1)
            return n;
        return f(n - 1) + f(n - 2);
    }
    static int countWays(int s)
    {
        return f(s + 1);
    }
    public static void main(String args[])
    {
        int a1 = 1;
        System.out.println("No.of ways = " + countWays(a1));

        int a2 = 3;
        System.out.println("No.of ways = " + countWays(a2));
    }
}

