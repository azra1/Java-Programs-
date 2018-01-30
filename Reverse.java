import java.util.*;
class Reverse
{
	public static void  main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string:");
		String a=sc.nextLine();
		String b[]=a.split("\\s");
		for(int i=(b.length-1); i>=0; i--)
		System.out.print(b[i]+" ");
	}
}