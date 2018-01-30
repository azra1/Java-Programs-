import java.util.*;
class Collection2
{
	public static void main(String arg[])
	{
		ArrayList al=new ArrayList();
		al.add(0,"Delhi");
		al.add(1,"Chennai");
		al.add(2,"Kolkata");
		al.add(3,34);
		al.add(4,"Hey");
		System.out.println(al);
		al.remove(al.indexOf(34));
		System.out.println(al);
		for(Object o: al)
		{
			System.out.println(al);
		}
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}