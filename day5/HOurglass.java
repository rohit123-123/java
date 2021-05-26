package patterns;
/*
1 2 3 4 5 6 7
 2 3 4 5 6 7
  3 4 5 6 7
   4 5 6 7
    5 6 7
     6 7 
      7
     6 7
    5 6 7
   4 5 6 7
  3 4 5 6 7
 2 3 4 5 6 7
1 2 3 4 5 6 7
						 */
public class HOurglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	for(int i = 1;i<=7;i++) 
	{
		
		for(int k =1;k<=i;k++) 
		{
			System.out.print(" ");
		}
		for(int j=i;j<=7;j++) 
		{
			System.out.print(j + " ");
		}
	System.out.println();
	}

	for(int i = 7;i>=1;i--) 
	{
		
		for(int k =1;k<=i;k++) 
		{
			System.out.print(" ");
		}
		for(int j=i;j<=7;j++) 
		{
			System.out.print(j + " ");
		}
	System.out.println();
	}
	
	
	}

	}


