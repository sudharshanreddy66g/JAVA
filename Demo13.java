class Demo13
{
	int a=20;
	public static void test()
	{
	   Demo13 d= new Demo13();
	   System.out.println(d.a);
	}
	@Override
	public int hashCode()
	{
	   return a;
	}
	public static void main(String [] args)
	{
	   Demo13 a=new Demo13();
	   Demo13 a1=new Demo13();
	   System.out.println(a.hashCode()==a1.hashCode());
	   System.out.println(a.equals(a1));
	}
}