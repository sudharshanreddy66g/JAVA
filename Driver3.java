class Color
{
	int i=10;
	Color(int i)
	{
	  this.i=i;
	}
	Color()
	{
	
	}
}
class Red 
{
  int j=10;
}
class Driver3
{
	public static void main(String [] args)
	{
	  Color c=new Color();
	  Red r = new Red();
	  c=r;
	  System.out.println(r.i);
	}
}