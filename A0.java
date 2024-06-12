class A0
{
	static int a =20;
	
	public static void demo()
	{
	   System.out.println("demo");
	}
}
class B extends A0
{
	static int b=30;
	public static void demo1()
	{
	  System.out.println("tenp");
	}
}
class Driver
{
	public static void main(String [] args)
	{
	  System.out.println(A0.a);
	  System.out.prinln(B.b);
	}
}