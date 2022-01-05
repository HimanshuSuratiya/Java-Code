import java.util.Scanner;
class Prime
{
	public static void main(String [] args)
	{
	int x;
	Scanner console = new Scanner(System.in);
	System.out.println("Enter a Number to find Prime or Not");
	x=console.nextInt();
	prime(x);
	}		
	static void prime(int n)
	{
   		for(int i=2; i<n; i++)
    		{
			if(n%i==0)
		{
			System.out.println("Not prime");
			return;
		}
  		}
			System.out.println("Prime");
	}
}