class Thread4 extends Thread
{
	public void run()
	{
	     try{
		for(int i=0; i<11; i++)
		{
			System.out.println(i);
		}
	         }
	     catch(Exception e){
			System.out.println(e.getMessage());
                       }
	}
	public void run1()
	{
	   try{
		for(int i=0; i<5; i++)
		{
			System.out.println(i);
		}
                       }
	   catch(Exception e){
				System.out.println(e.getMessage());
		}
	}
}
class Main
{
	public static void main(String arg[])
	{
		try{
		Thread4 t1=new Thread4();
		Thread4 t2=new Thread4();
		t1.setDaemon(true);
		t1.run();
		t2.run1();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
	