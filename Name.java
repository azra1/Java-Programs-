import java.util.*;
class Name
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name: ");
		String a=sc.nextLine();
		String b[]=a.split("\\s");
		int i=0;
		while(i!=b.length)
		{	if(i!=(b.length-1))
			System.out.print(b[i].charAt(0)+".");
			else
			System.out.print(b[b.length-1]);
				i++;
		}
	}
}