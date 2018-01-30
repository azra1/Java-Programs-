import java.util.*;
class Check
{
	public static void main(String arg[])
	{
		String a[]= {"Azra","Rawat", "Stuti"};
		String b[]={"IIHT","IIT","MAIT"};
		String c;
		int flag=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the name: ");
		c=sc.nextLine();
		System.out.print("Enter the password: ");
		String d=sc.nextLine();
		for(int i=0; i<3; i++)
		{
			if(c.compareTo(a[i])==0&&d.compareTo(b[i])==0)
			{	System.out.println("Login Succesfull");
					flag=1;
					break;

			}
			
		}
		if(flag==0)
		System.out.println("Login failed");
	}
}	
		
