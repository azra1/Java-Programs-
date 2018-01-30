class Operation
{
	int Square(int a)
	{
		int s=a*a;
		return(s);
	}
}
class Area
{
	Operation ob;
	
	double pi=3.14;
	double FindArea(int radius)
	{
		ob = new Operation();
		int sq=ob.Square(radius);
		return(pi*sq);
	}
	public static void main(String arg[])
	{
		Area a= new Area();
		double result=a.FindArea(2);
		System.out.println("THE AREA IS "+result);
	}
}