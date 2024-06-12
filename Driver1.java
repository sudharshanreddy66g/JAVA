class Child
{
	int a=30;
	Child(int a)
	{
	  this.a=a;
	}
	void hide()
	{
	  System.out.println(a);
	}
}
class Parent extends Child
{
	int b;
	void demo()
	{
	  System.out.println(b);
	}
}
class Driver1
{
	public static void main(String [] args)
	{
	  Parent p=new Parent();
	  p.hide();
	}
}