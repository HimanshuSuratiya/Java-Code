

import java.util.*;
class Rectangle
{
	int length;
	int width;
	
	Rectangle(int a, int b)
	{ length=a;   width=b;	}
	
	int getarea()
	{ return length*width;	}
}

public class Redgear
{
	public static void main(String []args)
	{
		ArrayList<Rectangle> l1 = new ArrayList<>();
		l1.add(new Rectangle(4,5));
		l1.add(new Rectangle(6,5));
		l1.add(new Rectangle(7,5));
		l1.add(new Rectangle(4,6));

		for (int i = 0; i<l1.size(); i++)
		{
			System.out.println(l1.get(i).getarea());
		}
	}




}

