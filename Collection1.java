import java.util.*;
class Collection1
{
	public static void main(String arg[])
	{
		ArrayList al=new ArrayList();
		ArrayList al2=new ArrayList();
		al.add("Delhi");
		al.add("Noida");
		al.add(null);
		al.add(50);
		al2.add("Delhi");
		al2.add("Noida");
		al2.add(null);
		al2.add(50);
		al2.addAll(al);
		System.out.println(al2);
		System.out.println(al);
		System.out.println(al2.size());
		System.out.println(al.isEmpty());
		System.out.println(al.containsAll(al2));
		al.retainAll(al2);
		System.out.println(al2);
		//al.removeAll(al);
		System.out.println(al.isEmpty());
		System.out.println(al2.hashCode());
		ArrayList al3=new ArrayList();
		al3.add(78);
		al3.add(45);
		al3.add(556);
		int arr[]=new arr[3];
		arr=al3.toArray(arr);
		
		
	}
}
		