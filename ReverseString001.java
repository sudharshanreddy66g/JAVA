class ReverseString001
{
	public static void main(String [] args)
	{
			
		String str="Rama";
		StringBuilder reverseString=new StringBuilder();

		for(int i=str.length()-1;i>=0;i--)
		{
		   reverseString.append(str.charAt(i));	
		}
		  System.out.println(reverseString.toString());
			
	}
}