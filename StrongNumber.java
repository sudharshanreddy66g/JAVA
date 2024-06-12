/*

// Strong number

Strong number
-------------
-> The sum of factorial of each digit is equal to the given number
   is known as a strong number.

Example:-
-------

int n = 123; n%10;
3! = 3*2*1=6

Stpes to achive strong number :-
-------------------------------

1. Take user Input.
2. Fetch one one last digit.
3. Find the factorial.
4. Add the factors.
5.Remove the last digit.
6. Repeat same thing until number become to 0.
7. Finally check result is equal to given number result is equal to.


*/

import java.util.Scanner;

class StrongNumber
{
	public static void main(String [] args)	
	{
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter a number .....");
	   int num = scan.nextInt();
	   int sum = 0;
	   int temp =  num;
	   while (num > 0) 
	  {

	   int rem = num % 10;
	   int fact = 1;
	    
	   for(int i = 1;i<=rem;i++)
	   {
	            fact = fact * i;
	   	     
	   }
	    sum = sum + fact;
	    num/=10;
 	  }
	  if(sum == temp)
	  {
	     System.out.println("Strong Number...");
	  }
	  else
	  {
	     System.out.println("Not a Strong Number...");
	  }
	




	}
}

















