// Reverse String

class ReverseString3
{
	public static void main(String [] args)
	{
	
	     String str="Sudharshan";
	     // String reversed= "";
	     
	      StringBuilder reversed=new StringBuilder();
	     for(int i=str.length()-1;i>=0;i--)
	     {
	           // reversed +=str.charAt(i);
	           reversed.append(str.charAt(i));
	     }
	     
	      // System.out.println("Reversed string is: "+ reversed);
	      System.out.println(reversed.toString());
	        
	         
	      
	
	
	}
}