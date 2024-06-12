// WAJP to given no is prime number or not ?

// Any number having 2 factors then we can it as prime no.

// Any number which is divisible by only one and itself we can call it has a prime number.

// Trace until given number.
// Find the factors.
// Count the factor.
// We are having only 2 factors given number is prime.


class PrimeNumber
{
	public static void main(String [] args)
	{
	   int num = 5;
	   int count = 0;
	   for(int i = 1;i<=num;i++)
	   {
	     if(num % i == 0)
	        count++;
	   }
	   if(count == 2)
	   {
	       System.out.println("Given Number is Prime Number.....");
	   }
	   else
	   {
	      System.out.println("Given Number is Composite.......");
	   }
	     




	   
	
	
	}
}