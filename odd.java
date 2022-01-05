import java.util.Scanner;
class odd
{
	public static void main(String [] args)
	{
		int x;
		Scanner console = new Scanner(System.in);	
		System.out.println("Enter a Number to check odd and even");
		x=console.nextInt();
		prime(x);	
	}
	public static void prime(int x)
	{
		if(x%2==0)
		System.out.println("This Number is even");
		else
		System.out.println("This Number is odd");
	}
}