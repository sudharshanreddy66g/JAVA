// Armstrong Number

class ArmStrongNumber
{
	public static void main(String [] args)
	{
	
	     int number=153;
	     int originalNumber, remainder, result=0;
	     originalNumber=number;
	     	
	     while(originalNumber !=0)
	     {
	        remainder=originalNumber % 10;
	        result +=Math.pow(remainder, 3);
	        originalNumber /=10;
	     }
	        	
	        if(result==number)
	            System.out.println(number + " is an armstrong number.");
	        else
		    System.out.println(number + " is not an armstrong number.");
	     
	
		
	}
}
	