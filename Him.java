import java.util.Scanner;
class Rectangle
{
	int length;
	int width;
	Rectangle()
	{
		length=0;
		width=0;
	}
	Rectangle(int l,int b)
	{
		length=l;
		width=b;
	}
	void setdata(int l,int b)
	{
		length=l;
		width=b;
	}
	int getArea()
	{
		return length*width;
	}
	void showdata()
	{
		System.out.println("Length = "+length);
		System.out.println("Width = "+width);
	}
	int getlength()
	{
		return length;
	}
	int getwidth()
	{
		return width;
	}
}
class Box extends Rectangle
{
	int height;
	Box()
	{
		super();
		height=0;
	}
	Box(int a, int b, int c)
	{
		super(a,b);
		height=c;
	}
	int getvolume()
	{
		return getlength()*getwidth()*height;
	}
	int getarea()
	{
		return 2*((getlength()*getwidth())+(getwidth()*height)+(height*getlength()));
	}
}

public class Him
{
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);
		Box b = new Box(3,4,5);
		System.out.println("Volume of Box = "+b.getvolume());
		System.out.println("Area Of Box = "+b.getarea());
	}
}