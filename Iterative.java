
public class Iterative {

	public static int fibonacciIt(int n)
	{
		long startTime = System.nanoTime();
		int prepreNum, preNum = 0, curNum = 1;
		
		for (int i = 1; i < n; i++)
		{
			prepreNum = preNum;
			
			preNum = curNum;
			
			curNum = prepreNum + preNum;
		}
		long endTime = System.nanoTime();
		long resultTime = endTime - startTime;
		
		System.out.println("Iterative time is " + resultTime + " nanoseconds.");
		return curNum;
	}
	
}
