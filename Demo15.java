class Demo15
{
	int a;
	public static void test()
	{
	   Demo15 d=new Demo15();
	   System.out.println(d.a);
	}
	public boolean equals(Objkect a)
	{
	   return this.a==((Demo)o).a;
	}
	public int hashCode()
	{
	   return a;
	}
	public static void main(String [] args)
	{
	   Demo15 a=new Demo15();
	   Demo15 a1=new Demo15();
	   System.out.println(a.hashCode()==a1.hashCode());
	   System.out.println(a.equals(a1));
	}
}