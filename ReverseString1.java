// How to reverse a string

// By using StringBuilder class We can Reverse a string

class ReverseString1
{

	public static void main(String [] args)
	{

		String str="Hello World";
		StringBuilder reversed=new StringBuilder();
		for(int i=str.length()-1;i>=0;i--)
		{
	 	  reversed.append(str.charAt(i));
		}
		System.out.println(reversed.toString());
	}
}
	