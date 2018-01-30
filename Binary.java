import java.util.*;
class Binary{
		public static void main(String arg[])
		{
			Scanner sc= new Scanner(System.in);
			int a[]=new int[10];
			int size, element, i, flag=0;
			System.out.println("Enter the size of array: (max 6) ");
			size=sc.nextInt();
			int first=0, last=size-1, mid=(first+last)/2;
			for(i=0; i<size; i++)
			{
				a[i]=sc.nextInt();
				System.out.println(i+ " element is " +a[i]);
 
			}
			System.out.println("Enter the elment you want to search");
			element=sc.nextInt();
			while(last!=first)
			{
				if(a[mid]==element)
				{
					System.out.println("Your element is found at pos "+mid);
					flag=1;
					break;
				}
				else if(a[mid]>element)
				{
					first=mid+1;
					mid=(first+last)/2;
					
				}
				else if(a[mid]<element)
				{
					last=(size-1);
					mid=(first+last)/2;
					
				}
			}
			if(flag==0)
			System.out.println("Element not found");
	}
}
				