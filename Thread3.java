class Thread3 extends Thread
{
	public void run()
	{
	
		Thread t2=new Thread();
		t2.start();
		for(int i=0; i<=5; i++)
		{
			
			System.out.println(i);
		}

	}
}
class Main
{
	public static void main(String arg[])
	{
		Thread t1=new Thread();
		Thread3 obj=new Thread3();
		obj.run();
		t1.setDaemon(true);
		t1.start();
		for(int i=0; i<=10; i++)
		{
			
			System.out.println(i);
		}
	}
}
		
			