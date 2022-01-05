abstract class Shape
{	
	int length;
	int width;
	void setdata(int a, int b)
	{
		length=a;
		width=b;
	}
	abstract int getarea();
}
class Rectangle extends Shape
{
	int getarea()
	{
		return length*width;
	}
}
class Triangle extends Shape
{
	int getarea()
	{
		return length*width/2;
	}
}
public class Abstrac
{
	public static void main(String []args)
	{
		int x,y;
		Shape R1 = new Rectangle();
		Shape T1 = new Triangle();
		R1.setdata(10,12);
		x=R1.getarea();
		System.out.println("Area of Rectangle = "+x);
		T1.setdata(15,12);
		y=T1.getarea();
		System.out.println("Area of Triangle = "+y);
	}
}





