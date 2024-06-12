class String07
{
	public static void main(String [] args)
	{
	   String s= "Hello";
	   String s1 = "";
	  while(s.length() > 0)
	  {
	   
	   char ch = s.charAt(0);
	   s1 = s.replace(ch+"","");
	   // System.out.println(s1);
	   int count = s.length() - s1.length();
	   System.out.println(ch + " --------> "+ count);
	   s=s1;
	  }
	
	}
}