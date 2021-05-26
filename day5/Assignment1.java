package patterns;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   int a=1; int b=1; 
			for(int i=0;i<6;i++)
			{
				int j;
				for(j=5;j>=i;j--)
				{
			System.out.print(" ");;	
				} 	
				int k;
				for(k=1;k<=a;k++)
				{
					System.out.print(Math.abs(k-b));
				}
				a+=2;
				b++;
			System.out.println();
			}
	
			   int c=1; int d=1; 
				for(int i=6;i>0;i--)
				{
					int j;
					for(j=5;j>=i;j--)
					{
				System.out.print(" ");;	
					} 	
					int k;
					for(k=1;k<=c;k++)
					{
						System.out.print(Math.abs(k-d));
					}
					c+=2;
					d++;
				System.out.println();
				}
		
	
	}

}
