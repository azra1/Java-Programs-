class Thread2 implements Runnable
{
	public void run()
	{
		for(int i=0; i<=10; i++)
	{
		System.out.println(Thread.currentThread().getName()+" "+i);
		try{
			Thread.sleep(500);
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
		Thread2 obj=new Thread2();
		Thread t1= new Thread(obj);
		t1.start();
		Thread t2= new Thread(obj);
		t2.start();
		for(int i=0; i<11; i++)
		{
		System.out.println(Thread.currentThread().getName()+" "+i);
		try{
			Thread.sleep(500);
			}
		catch(Exception e)
		{ }
		}
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		System.out.println(t1.getPriority());
	}
}