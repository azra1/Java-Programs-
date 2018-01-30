import java.util.*;
class Parent
{
	int a, b;
	void sum(int a, int b)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number");
		a=sc.nextInt();
		System.out.println("Enter the second number");
		b=sc.nextInt();
		this.a=a;
		this.b=b;
	}
}
class Child extends Parent
{
	int c;
	void Final()
	{
		sum(a,b);
		c=a+b;
		System.out.println("The sum of given no is "+c);
	}
}
class Main1
{
	public static void main(String arg[])
	{
		Child ob= new Child();
	
		ob.Final();
	}
}