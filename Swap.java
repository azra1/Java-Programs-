import java.util.*;
class Swap{
		public static void main(String arg[])
		{
			Scanner sc= new Scanner(System.in);
			int a[]=new int[10];
			int size, temp, i;
			System.out.println("Enter the size of array: (max 6) ");
			size=sc.nextInt();
			for(i=0; i<size; i++)
			{
				a[i]=sc.nextInt();
				System.out.print(i+ " element is " +a[i]);
 
			}
			temp=a[2];
			a[2]=a[4];
			a[4]=temp;
			System.out.println("After swapping two values the array is: ");
			for(i=0; i<size; i++)
			{
				System.out.println(i+" element is "+a[i]);
 
			}
		}
}