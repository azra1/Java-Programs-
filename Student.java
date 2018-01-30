import java.util.*;
class Student implements Comparable
{
	int roll;
	String name;
	Student(int roll, String name)
	{
		this.roll=roll;
		this.name=name;
	}
	public int compareTo(Object o)
	{
		Scanner sc= new Scanner(System.in);
		Student s1=(Student) o;
		System.out.println("Enter your choice: ");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:	if(roll<s1.roll)
			return -1;
		else if(s1.roll<roll)
			return 1;
		else return 0;
		case 2:  return name.compareTo(s1.name);
		default: System.out.println("Wrong choice");
			return 0;
		}
	}
}
class M
{
	public static void main(String arg[])
	{
		Student s1= new Student(104, "Azra");
		Student s2= new Student(105, "Stuti");
		Student s3=new Student(103,"Rawat");
		ArrayList <Student>al=new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		System.out.println(al);
		Collections.sort(al);
		for(Student o:al)
		{
			//Student s=(Student) o;
			System.out.println(o.roll);
			System.out.println(o.name);
		}
	}
}
