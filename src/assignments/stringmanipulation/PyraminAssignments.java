package assignments.stringmanipulation;

public class PyraminAssignments {

	public static void main(String[] args) {
		
		createPyramin(5);
	}
	
	public static void createReverseTraingle(int n)
	{
		for (int i=0;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void createTraingle(int n)
	{
		for (int i=0;i<=n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
	public static void createPyramin(int n)
	{
		for (int i = 0; i < n; i++) 
        {
          for (int j = n-i; j >1; j--) 
            { 	  
               System.out.print(" ");
            } 
          for (int k = 0; k <= i; k++) 
            { 
                System.out.print("* "); 
            }   
            System.out.println(); 
        } 
	}
	
	public static void printoddPrymin(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
              System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++)
            {
              System.out.print("*");
            }
            System.out.println("");
        }
        
       
    }
	
	public static void createReversePyramin(int n)
	{
		for (int i = 1; i <= n; i++) 
        {
          for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            } 
          for (int j = i; j <= n; j++) 
            { 
                System.out.print("* "); 
            }   
            System.out.println(); 
        } 
	}

}



