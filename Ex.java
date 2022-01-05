import java.util.Scanner;
class Student
{
	private int rollno;
	private String name;
	private int marks;

	public void setdata(int r, String n, int m)
	{ 
		rollno=r; 
		name=n; 
		marks=m;
	}
	public void showdata()
	{
		System.out.println("Rollno of Student is = "+rollno);
		System.out.println("Name of Student is = "+name);
		System.out.println("marks of Student is = "+marks);
	}
	public int getmarks()
	{
		return marks;
	}
}
public class Ex
{
	public static void main(String []args)
	{
                int size = 3;
		
                Student[] list = new Student[size];
		Scanner console=new Scanner(System.in);
		for(int i =0;i<size;i++)
		{
		System.out.println("Rollno");
		int r = console.nextInt();
		System.out.println("Name");
		String n = console.next();
		System.out.println("Marks");
		int m = console.nextInt();
		list[i]=new Student();
                list[i].setdata(r,n,m);
		}
		for(int i=0;i<size;i++)
		{
		  list[i].showdata();
		}
		findmax(list);
			
	}
		static void findmax(Student[] list)
		{
			int marks=0,pos=0;
			for(int i=0; i<list.length; i++)
			{
				if(list[i].getmarks() > marks)
				{	
					marks=list[i].getmarks();
					pos=i;
				}
			}
			list[pos].showdata();
		}
}