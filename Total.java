import java.util.Scanner;
public class Total
{
	public static void main(String []args)
	{
		int x,y,z;
		int size;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of Array");
		size=s.nextInt();
		int[] A = new int[size];
		for(int i=0; i<size; i++)
		{
			System.out.println("Enter Value of A["+i+"] of Array");
			A[i]=s.nextInt();	
		}
		x=sum(5,5);
		y=sum(2,4,6);
		z=sum(A);
		
		System.out.println("Sum of two Numbers is = "+x);
		System.out.println("Sum of three Numbers is = "+y);
		System.out.println("Sum of Array is = "+z);	
	}
	static int sum(int... A)
	{	
		int sum=0;
		for(int i=0; i<A.length; i++)
		{
			sum=sum+A[i];
		}
		return sum;
	}
}