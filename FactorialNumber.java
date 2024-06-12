// 2). FactorialNumber

class FactorialNumber
{
	public static void main(String [] args)
	{
	  int number=10;
	  int factorial=1;
	  
	  for(int i=1;i<=number;i++)
	  {
	      factorial *=i;
	  }
	   System.out.println("Factorial of number : "+  number + " is "+factorial);
	
	}
}