import java.util.Scanner;

class CircleArea
{
	public static void main(String [] args)
	{
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Enter the radius of the circle: ");
	   double radius=scan.nextDouble();
	   double area=Math.PI*radius*radius;
	   System.out.println("The area of the circle with radius " + radius + " is: " + area);
	 
	
	}
}