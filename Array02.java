class Array02
{
	public static void main(String [] args)
	{
	    int[] a={1,2,30,4,5};
            int max=a[0];
	
	    for(int i=0;i<=a.length-1;i++)
	    {
	       if(a[i] > max)
	       {
	          max=a[i];
	       }
		
	
	    }
		System.out.println(max);
	
	}
}