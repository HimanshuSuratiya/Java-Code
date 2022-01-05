interface Animal
{
	void setname(String n);
	String getname();
	void makenoise();
}

class Dog implements Animal
{
	String name;
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
		System.out.println("Dog sound is Bho bho");
	}
}

class Cat implements Animal
{
	String name;
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

public class Animal
{
	public static void main(String []args)
	{
		String dog,cat;
		Dog D1 = new Dog();
		Cat C1 = new Cat();
		
		D1.setname("lovely");
		dog=D1.getname();
		System.out.println("My name is "+dog);
		D1.makenoise();
		C1.setname("Panny");
		cat=C1.getname();
		System.out.println("My name is "+cat);
		C1.makenoise();		
	}
}
