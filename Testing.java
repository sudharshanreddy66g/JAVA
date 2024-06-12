class Testing
{
	public static void main(String [] args)
	{
	   System.out.println("Hello, World!");
	   int number = 10;
	
	   if (number == 10)
	   {
	      System.out.println("Number is ten");
	   }
	   else
	   {
	      System.out.println("Number is not ten");
	   }
	   for(int i=0; i< 5;i++)
	   {
	      System.out.println("i is: " + i);
	   }
	   String[] names = {"Alice", "Bob", "Charlie"};
	   for(String name : names)
	   {
		System.out.println(name);
	   }
	
	}
}