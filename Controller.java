import java.util.Scanner;

public class Controller {

	public static void main(String[] args)
	{	
		System.out.println("This program returns the nth Fibonacci number in a sequence given the input number.");
		System.out.print("Please input an integer >> ");
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		System.out.println();
		
		int it = Iterative.fibonacciIt(n);
		System.out.println("When n = " + n + " in the fibonacci sequence, the result is " + it + ". [Iterative]");
		
		int re = Recursive.fibonacciRe(n);
		System.out.println("Recursive time is " + Recursive.sumTime + " nanoseconds.");
		System.out.println("When n = " + n + " in the fibonacci sequence, the result is " + re + ". [Recursive]");
	}
	
}
