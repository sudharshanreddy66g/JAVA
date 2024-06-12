import java.util.Scanner;

class ATM4
{
	public static void main(String [] args)
	{
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Generate 4 Digit Pin");
	  int pin=scan.nextInt();
	  System.out.println("---SBI ATM-----");
	  int balance=0;
	  while(true)
	  {
	       System.out.println("-------------------------------");	
	       System.out.println("1.A/C details\n2.Deposite\n3.Withdrawn\n4.Check Balance\n5.Exit");
	       System.out.println("Enter chice");
	       int choice=scan.nextInt();
	       switch(choice)
	       {
		    case 1:
		       System.out.println("A/C Holder Name: Smith");
		       System.out.println("AC NO:12345678789876\nIFSC CODE: SBIN Y12\nBranch Name:XYZ");
		       break;

	            case 2:
		       System.out.println("Enter money to deposite");
		       int deposite=scan.nextInt();
		       balance=balance+deposite;
		       System.out.println("Deposite successfully...");
		       break;
		
	            case 3:
		       System.out.println("Enter a mony top with drawn");
		       int withdrawn=scan.nextInt();
		       System.out.println("Enter a pin");
		       int p=scan.nextInt();
		       if(withdrawn<=balance)
		       {
			  if(pin==p)
		          {
				System.out.println("Withdrawn successfully");
			  }
		          else
			  {
				System.out.println("Incorrect pin.....try once");
			  }
			}
			else
			{
				System.out.println("In sufficinet balance...");
			}
			break;

		   case 4:
			System.out.println("Balance is:"+ balance);
			break;
		   case 5:
		       System.out.println("Thank You");
		       System.exit(0);
		  
		    default :
		      System.out.println("Invalid Choice");
		}
	    }	
	
	}
}