import java.util.*;
interface Animal
{
	void setname(String n);
	String getname();
	void makenoise();
}

class Dog implements Animal
{
	String name;
	public Dog(String n)
	{
		name=n;
	}
	public void setname( String n)
	{
		name=n;
	}
	public String getname()
	{
		return name;
	}
	public void makenoise()
	{
		System.out.println("Dog sound is Bho bho");
	}
}

class Cat implements Animal
{
	String name;
	public Cat(String n)
	{
		name=n;
	}
	public void setname(String n)
	{
		name=n;
	}
	public String getname()
	{
		return name;
	}
	public void makenoise()
	{
		System.out.println("Cat sound is meau meau");
	}
}

public class Animal2
{
	public static void main(String []args)
	{
		ArrayList<Animal> A1 = new ArrayList<>();
		A1.add(new Dog("Lovely"));
		A1.add(new Cat("pinny"));
		A1.add(new Dog("Tommy"));
		A1.add(new Cat("jully"));	

		for(Animal A : A1)
		{
			System.out.print(A.getname()+" makes ");
			A.makenoise();
		}
	}
}
