package Dbwork;
import java.util.*;
import java.sql.*;
public class Dbwork
{
	Connection con=null;
public Dbwork()
{
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/DBWORK","root","");
		}
	catch(Exception e){System.out.println(e);}
	}
	void insert(int roll, String name,String city, int marks)
	{
		try{
			Statement stmt=con.createStatement();
			String q="Insert into  student values("+roll+",'"+name+"','"+city+"',"+marks+")";
			int x=stmt.executeUpdate(q);
			if(x>0)
			{
				System.out.println(x+"record inserted");
			}
			}catch(Exception e){System.out.println(e);}
	}
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter you roll no: ");
		int roll=Integer.parseInt(s.nextLine());
		System.out.println("Enter your name: ");
		String name=s.nextLine();
		System.out.println("Enter your city:");
		String city=s.nextLine();
		System.out.println("Enter your marks: ");
		int marks=Integer.parseInt(s.nextLine());
		new Dbwork().insert(roll,name,city,marks);
	}
}

