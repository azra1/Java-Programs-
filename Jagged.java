import java.util.*;
class Jagged
{
	public static void main(String arg[])
	{
		int a[][]= new int[3][];
		a[0]=new int[2];
		a[1]=new int[3];
		a[2]=new int[1];
		Scanner sc= new Scanner(System.in);
		for(int i=0; i<3; i++)
		{
			if(i==0)
			{
				for(int j=0; j<2; j++)
				a[i][j]=sc.nextInt();
			}
			if(i==1)
			{
				for(int j=0;j<3; j++)
				a[i][j]=sc.nextInt();		
			}
			if(i==2)
			a[i][0]=sc.nextInt();
		}
		for(int i=0; i<3; i++)
		{
			if(i==0)
			{
				for(int j=0; j<2; j++)
				System.out.print(a[i][j]+" ");
				System.out.println("");
			}
			if(i==1)
			{
				for(int j=0;j<3; j++)
				System.out.print(a[i][j]+" ");
				System.out.println("");		
			}
			if(i==2)
			System.out.print(a[i][0]+" ");
		}
	}
}