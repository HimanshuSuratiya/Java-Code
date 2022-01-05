import java.util.Scanner;
class ArrayOperation
{
	public static void lsearch(int[] A, int n)
	{
		for(int i=0; i<A.length; i++)
		{
			if(A[i]==n)
                        {
				System.out.println("Found");
				return;
			}
		}
			System.out.println("not Found");
	}
}

public class Demo
{
	public static void main(String []args)
	{
		int size;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size of Array");
		size=s.nextInt();
		int[] A = new int[size];
		for(int i=0; i<size; i++)
		{	
			System.out.println("Enter Value of A["+i+"] of Array");
			A[i]=s.nextInt();	
		}
		for(int i=0; i<size; i++)
		{
			System.out.println("Array is A["+i+"] =" +A[i]);
		}
			ArrayOperation.lsearch(A,19);	
	}
}