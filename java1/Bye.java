import java.io.*;
class Bye
{
	char divide()throws IOException
	{
		char z=(char)System.in.read();
		return(z);
	}
	public static void main(String arg[])throws IOException
	{
		Bye b=new Bye();
		char a=b.divide();
		System.out.println(a);
	}
}
