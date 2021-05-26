package patterns;
 												





public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
			for(int i=0;i<6;i++)
			{
				int j;
				for(j=5;j>=i;j--)
				{
			System.out.print(" ");;	
				} 	
				int k;
				for(k=1;k<=i;k++)
				{
					System.out.print("* ");
				}
				
			System.out.println();
			}
			for(int i=6;i>=1;i--)
			{
				int j;
				for(j=5;j>=i;j--)
				{
			System.out.print(" ");;	
				} 	
				int k;
				for(k=1;k<=i;k++)
				{
					System.out.print("* ");
				}
				
			System.out.println();
			}
	
	
	
	}

}
