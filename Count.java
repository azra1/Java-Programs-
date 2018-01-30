import java.util.*;
class Count
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String a= sc.nextLine();
		int alph=0;
		int dig=0;
		int bl=0;
		int spc=0;
		byte b[]=a.getBytes();
		for(int c: b)
		{
			if((c>=65&&c<=90)||(c<=122&&c>=97))
				alph++;
			if(c<=57&&c>=48)
				dig++;
			if(c==32)
			bl++;
			if((c<=47&&c>=33)||(c<=64&&c>=58))
			spc++;
		}
		System.out.println("No of alphabets="+alph);
		System.out.println("No of digits="+dig);
		System.out.println("No of blanks="+bl);
		System.out.println("No of special characters="+spc);
		
	}
}