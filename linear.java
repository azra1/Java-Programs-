import java.util.*;
class Linear{
		public static void main(String arg[])
		{
			Scanner sc= new Scanner(System.in);
			int a[]=new int[10];
			int size, element, i, flag=0;
			System.out.println("Enter the size of array: (max 6) ");
			size=sc.nextInt();
			for(i=0; i<size; i++)
			{
				a[i]=sc.nextInt();
				System.out.println(i+ " element is " +a[i]);
 
			}
			System.out.println("Enter the elment you want to search");
			element=sc.nextInt();
			for(i=0; i<size; i++)
			{
				if(a[i]==element)
				{
					System.out.println("You got the element at pos "+i);
					flag=1;
					break;
				}
			}
			if(flag==0)
			System.out.println("You never got the element");
		}
}
				