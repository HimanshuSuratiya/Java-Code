import java.util.Scanner;
class Fac
{
	public static void main(String [] args)
        {
	        int x,Result;	
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a Nummber to factorial");
		x=console.nextInt();
		Result=fac(x);
		System.out.println("Factorial is = "+Result);
	}	
	public static int fac(int n)
	{	
	int fact=1;
	for(int i=1; i<=n; i++)
	{
		fact=fact*i;	
	}	
	return fact;
        }
}