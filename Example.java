public class Example
{
	public static void main(String [] args)
	{
		int result;
		Rectangle R1 =new Rectangle();
		R1.setdata(10,15);
		result=R1.getarea();
		System.out.println("Area of Rectangle is ="+result);
 	}
}
class Rectangle
{
	private int length,breadth;
	public void setdata(int length, int breadth)
	{ this.length=length; this.breadth=breadth;}
	public int getarea()
	{ return length*breadth; }	
}