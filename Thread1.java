class Thread1 extends Thread
{
	public void run()
	{
		for(int i=0; i<=10; i++)
	{
		System.out.println(i);
		try{
			sleep(500);
			}
		catch(Exception e)
		{ }
	}
	}
}
class Main
{
	public static void main(String arg[])
	{
		Thread1 t1= new Thread1();
		t1.run();
		Thread1 t2= new Thread1();
		t2.start();
		for(int i=0; i<11; i++)
		{
		System.out.println(i);
		try{
			Thread.sleep(500);
			}
		catch(Exception e)
		{ }
		}
	}
}