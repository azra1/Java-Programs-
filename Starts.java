import java.util.*;
class Starts
{
	public static void main(String arg[])
	{
		String a[]={"Allahbad", "Agra","Delhi","Kolkata","Noida"};
		String b;
		int flag=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first letters of tha place:");
		b=sc.nextLine();
		for(int i=0; i<5; i++)
		{
			if(a[i].startsWith(b))
			{	System.out.println("The City Found Is: "+a[i]);
				flag=1;
				

			}
		}
		if(flag==0)
		System.out.println("Not Found");
	}
}