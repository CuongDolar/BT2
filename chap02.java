package chap1;
public class chap02
{
	/* public static void main(String[] args)
	    {
		  int a=5,b=10,c=15,tam;
		  tam=Math.max(a,b);
		  tam=Math.max(tam,c);
		  System.out.println(" max la " +tam);
	    	
		}
    public static void main(String[] args)
    {
    	
    	int a=10,b=5;
    	double c =123.456,k,random;
    	
        int result=Math.max(a,b);
    	System.out.println( result );
    	result=Math.min(a,b);
    	System.out.println( result );
    	
    	System.out.println( k=Math.floor(c));
    	System.out.println( "lam tron so " +Math.round(c));
    	random=Math.random();
    	System.out.println("So ngau nhien "  +random);
    	
	}
	
	public static void main(String[] avg)
	{
		int max=15;
		int min=10;
		int random=0;
		int x=(max-min)+1;
		random= (int)(Math.random()*x)+ min;
		System.out.println("so ngau nhien " +random);
		
	}
	
	/*
	 public static void main(String[] avg)
	 
	{
		int a=16;
		if(a%2==0)
			System.out.println("a la so chan");
		else
			System.out.println("a la so le");
		
	}
	public static void main(String[] args) {
		int a=10;
		if(a==0)
		  System.out.println("a la 0");
		else if(a%2==0)
			 System.out.println("a la chan");
		else
	     System.out.println("a la le");
	}
	
	public static void main(String[] args)
	{
		 int a=1;
		 String k="";
		switch (a)
		{
		case 2:
			k="thu 2";
			break;
		case 3:
			k="thu 3";
			break;
		case 1:
		case 8:
			k="chu nhat";
		default:
			k="chu nhat";
			break;
		}
		System.out.println(k);
	}
	*/
   public static void main(String[] args) 
   {
	 
	  for(int j=1;j<=10;j++)
	  { 
		  System.out.println("Bang cuu chuong " +j);
	      for(int i=1;i<=10;i++)
		   System.out.println(i+ " * " +j+ "=" +j*i);
	      System.out.println("\n");
	  }
   }
}
