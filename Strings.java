class Strings
{
	public static void main(String [] args)
	{
	
	   String s= "Hello";
	   System.out.println(s.length());
	   System.out.println(s.toLowerCase());
	   System.out.println(s.toUpperCase());
	   char[] ch = s.toCharArray();
	   System.out.println(ch);
	
	   String s1="Developer";
	   System.out.println(s1.startsWith("Dev"));
	   System.out.println(s1.endsWith("r"));
	   System.out.println(s1.charAt(2));
	   System.out.println(s1.indexOf('o'));
	   System.out.println(s1.indexOf('x'));
	   System.out.println(s1.lastIndexOf('e'));
	   String s2= "program";
	   System.out.println(s1.substring(3));
	   System.out.println(s1.substring(0,3));
	   String s3="java";
	   String s4="java";
	   String s5="java";
	   System.out.println(s3.equals(s4));
	   System.out.println(s3.equals(s5));
	   System.out.println(s3.equalsIgnoreCase(s5));
	   System.out.println(s3.contains("av"));
	   String s6="   java is an oop lang   ";
	   System.out.println(s6.trim());
	   System.out.println(s3.replace('j', 'B'));
	   System.out.println(s3.concat("Programing Language"));
	   String[] str= s6.split(" ");
	   System.out.println(str);
	   for(String ss : str)
	   {
		System.out.println(ss);
	   }
	 
	   
	   

	
	
	}
}