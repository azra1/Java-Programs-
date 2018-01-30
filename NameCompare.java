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
	Student s=(Student)o;
		return name.compareTo(s.name);
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
