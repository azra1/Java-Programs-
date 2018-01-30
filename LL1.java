import java.util.*;
class LL1
{
	public static void main(String arg[])
	{
		LinkedList ll= new LinkedList();
		ll.add("Emanshi");
		ll.add("Azra");
		ll.add(90);
		ll.add(null);
		LinkedList ll1= new LinkedList();
		ll1.add("Rawat");
		ll1.add("Azra");
		ll1.add(900);
		ll1.add(null);
		//System.out.println(ll.pollLast());
		//System.out.println(ll.getLast());
		for(Object o: ll)
		System.out.println(o);
		System.out.println(removeFirstOccurence(90));
	}
}