class X
{
	static int a=25;
	int b=20;
	public static void m1()
	{
	  System.out.println("h");
	}
	public static void main(String [] args)
	{
	   System.out.println(a);
	   X x=new X();
	   x.a=12;
	   System.out.println(X.b);
	}
}