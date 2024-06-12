// FibonacciSeries

class FibonacciSeries1
{
	public static void main(String [] args)
	{
	
	   int n=10; // Number of terms
	
	   int a=0, b=1, c;
	   for(int i=0;i<n;i++)
	   {
	     System.out.println(a + " ");
	     c=a+b;
	     a=b;
	     b=c;
	   }
	
	
	}
}