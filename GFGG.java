import java.util.*;
class GFGG
{
	public static void main(String arg[])
	{
		int count=0;
		 int flag=0;
		int c;
		Scanner sc= new Scanner(System.in);
		int T=sc.nextInt();
		for(c=0; c<T; c++)
		{
			String a=sc.nextLine();
			String b=sc.nextLine();
			int al=a.length();
			int bl=b.length();
			for(int i=0; i<bl;i++)
			{
				for(int j=0; j<al; j++)
			 	{
					if(b.charAt(i)==a.charAt(j))
					{	count++;
						break;
					}
			}
		}
		if(count==bl)
		flag++;
		}
		for(c=0; c<T; c++)
		{
			if(flag>0)
			{
				System.out.println("1");
				flag--;
			}
			else if(flag==0)
				System.out.println("0");
		}
		
	}
}