import java.util.*;
class Diagnol{
		public static void main(String arg[])
		{
			Scanner sc= new Scanner(System.in);
			int a[][]=new int[10][10];
			int b[]= new int[10];
			int r, c, i, j;
			System.out.println("Enter the size of row of martix: (max 6) ");
			r=sc.nextInt();
			System.out.println("Enter the size of coloumn of matrix: (max 6) ");
			c=sc.nextInt();
			for(i=0; i<r; i++)
			{	for(j=0; j<c; j++)
				{

				a[i][j]=sc.nextInt();
		
 				}
			}
			System.out.println("Your matrix is");
			for(i=0; i<r; i++)
			{	for(j=0; j<c; j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			for(i=0; i<r; i++)
			{	for(j=0; j<c; j++)
				{	if(i==j)
					{
						b[i]=a[i][j];
					}
				}
			}
			System.out.println("Your diagnol array is:");
			for(i=0; i<r; i++)
			System.out.print(b[i]+" ");
		}
}