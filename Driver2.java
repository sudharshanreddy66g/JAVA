class A
{
	int a=10;
}
class B extends A
{
	int b=20;
}
class C extends A
{
	int c=30;
}
class D extends B
{
	int d=40;
}
class E extends D
{
	int e=50;
}
class F extends E
{
	int f=60;
}
class G extends F
{
	int g=70;
}
class H extends F
{
	int h=80;
}
class Driver2
{
	public static void main(String [] args)
	{
	    A al=new A();
	    D o = (D) al;
	    System.out.println(o.a);
	}
}