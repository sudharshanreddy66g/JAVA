class Array03
{
	// Zig zag array
	public static void main(String [] args)
	{
	  
	 int[] a={10,30,50};
	 int[] b={20,40,60};

	 int[] c=new int[a.length+b.length];
	
	 int j=0,k=0;
	
	  while(i<c.legth)
	  {
	    if(j<a.length)
	    {	
	
	      c[i]=a[j];
	      i++;
	      j++;
	    }
	    if(k <b.length)
	    {

	     c[i]=b[k];
	      k++;
	    }
	
	  }
	   System.out.println(Arrays.toString(c));
	
	}
}