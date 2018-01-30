class Dl
{
	public static void main(String arg[])
	{
		final String r1="Resource 1";
		final String r2="Resource 2";
		Thread t1=new Thread()
		{
			public void run()
			{
				synchronized(r1){
				System.out.println("Resource 1 lock");
				try{
					Thread.sleep(200);
					}
				catch(Exception e){ }
				synchronized(r2)
				{
					System.out.println("Going to lock Resource 2");
				}
			}
			}
		};
		Thread t2=new Thread()
		{
			public void run()
			{
				synchronized(r2){
				System.out.println("Resource 2 lock");
				try{
					Thread.sleep(200);
					}
				catch(Exception e){ }
				synchronized(r1)
				{
					System.out.println("Going to lock Resource 1");
				}
			}
			}
		};
		t1.start();
		t2.start();
	}
}
