/*

// Armstrong Number:-
--------------------

--> Sum of power of each digit is equal to given number.
--> Find how many digits in given number.
--> Apply count as a power of each digit.
--> Add.
-->Check result is equal to given number or not.

Example:-
--------

int n=321;
count = 3;

1^3 --> 1*1*1=1
2^3 --> 2*2*2=8;
3^3 --> 3*3*3=27
             ----
              36
             ----
Ex:-
----

int n=153;
count =3;

3^3 --> 3*3*3=27
5^3 --> 5*5*5=125
1^3 --> 1*1*1=1
              ----
              153
              ----

*/



import java.util.Scanner;

class ArmstrongNumber1
{
	public static void main(String [] args)
	{
	   Scanner scan = new Scanner(System.in);
           System.out.println("Enter a number...");
	   int num = scan.nextInt();
	   int count = 0;
	   int temp =  num;
	   int sum = 0;
	   while(num > 0)
	   {
	        num/=10;
	        count++;
	   }
	   num = temp;
	   while(num > 0)
	   {
	     num =  temp;
	     int rem = num % 10;
	     int pow = 1;
	    
	     for(int i = 1;i<=count;i++)
	     {
		pow = pow * rem;
	     }
	     sum +=pow;
	     num/=10;
	   }
	   if(sum == temp)
	   {
	     System.out.println(" Arm strong Number..");
	   }
	   else
	   {
	     System.out.println(" Not a armstrong number...");	
	   }    
	   
	}
}




