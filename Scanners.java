import java.util.Scanner;
class Scanners
{
	public static void main(String []args)
	{
		int x,y,z;
		Scanner console = new Scanner(System.in);
		System.out.println("Enter First Number ");
		x=console.nextInt();
 		System.out.println("Enter Second Number ");
		y=console.nextInt();
		z=x+y;
		System.out.println(" Sum of "+x+" and "+y+" is = "+z);
	}
}