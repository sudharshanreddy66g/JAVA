class String3
{
	public static void main(String [] args)
	{
	   String s="ABCD";
	   StringBuilder reversed=new StringBuilder();
	   for(int i=s.length()-1;i>=0;i--)
	  {
	     reversed.append(s.charAt(i));
	  }
	   System.out.println(reversed.toString());	
	
	}
}