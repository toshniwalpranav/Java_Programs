package Programs;

class Print{
	public static void A()
	{
		System.out.println("Print A ");
	}
	
	public static void B()
	{
		System.out.println("Print B");
	}
}

public class First_Programs
{
	public static void main(String args[])
	{
		Print.A();
		System.out.println("Im in first class");
		Print.B();
	}
}