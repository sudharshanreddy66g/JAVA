class ReverseString2
{
	public static void main(String [] args)
	{
	
	   String str="Hello Sudharshan";
	
	   StringBuilder reversed=new StringBuilder();
	   
	   for(int i=str.length()-1;i>=0;i--)
	   {
	      reversed.append(str.charAt(i));
	   }
	    System.out.println(reversed.toString());
	
	}
}