class Hk extends Thread
{
	public void run()
	{
		System.out.println("Hook Thread");
	}
} 
class M
{
	public static void main(String arg[])
	{
		Hk t1=new Hk();
		Runtime r=Runtime.getRuntime();
		r.addShutdownHook(t1);
		for(int i=0; i<21; i++)
		{
			System.out.println(i);
			try{
				Thread.sleep(200);
				}
			catch(Exception e){ }
			if(i==12)
			System.exit(0);
		}
	}
}