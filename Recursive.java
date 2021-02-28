
public class Recursive {

	static long sumTime = 0;
	
	public static int fibonacciRe(int n)
	{
		long startTime = System.nanoTime();
		if (n == 0)
		{
			return 0;
		}
		else if (n == 1)
		{
			return 1;
		}
		//result is returned later so time is not printed recursively
		int result = fibonacciRe(n - 1) + fibonacciRe(n - 2);
		long endTime = System.nanoTime();
		long resultTime = endTime - startTime;
		sumTime += resultTime;
		
		return result;
	}
	
}
