class A
{
	private int a=20;
	public static void set(int b)
	{
	  a=b;
	}
	public static void get()
	{
	   return a;
	}
	public static void main(String [] args)
	{
	   A a = new A();
	   System.out.println(a.get());
	}
}