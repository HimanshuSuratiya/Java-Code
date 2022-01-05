import java.util.Scanner;
class Perimeter
{
	public static void main(String []args)
	{
		int x,y,Perimeter;
		Scanner console=new Scanner(System.in);
		System.out.println("Enter a Length of Rectangle");
		x=console.nextInt();	
		System.out.println("Enter a Breadth of Rectangle");
		y=console.nextInt();
		Perimeter=2*(x+y);
		System.out.println("Perimeter of Rectangle is =" +Perimeter);


	}
}