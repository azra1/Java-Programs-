import java.util.*;
class X
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int a= sc.nextInt();
		int l=((2*a)-1);
		int ar[][]=new int[l][l];
		int count=1;
		for(int i=0; i<l; i++)
		{
			for(int j=0; j<l; j++)
			{
				if(i==(count-1)&&(j==(count-1)||count==(l-j)))
					ar[i][j]=count;
				count++;
				System.out.println(ar[i][j]);
			}
		}
	}
				
		
	
}
		