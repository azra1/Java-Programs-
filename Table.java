class Table
{
	synchronized public static void printTable(int no)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*no);
			try{
				Thread.sleep(200);
			}
			catch(Exception e){ }
		}
	}
}
class MyThread1 extends Thread
{
	Table table;
	MyThread1(Table table)
	{
		this.table=table;
	}
	public void run()
	{
		Table.printTable(5);
	}
}
class MyThread2 extends Thread
{
	Table table;
	MyThread2(Table table)
	{
		this.table=table;
	}
	public void run()
	{
		Table.printTable(22);
	}
}
class Ma
{
	public static void main(String arg[])
	{
		Table t=new Table();
		Table s=new Table();
		MyThread1 t1=new MyThread1(t);
		MyThread2 t2=new MyThread2(t);
		t1.start();
		t2.start();
		MyThread1 t3=new MyThread1(s);
		MyThread2 t4=new MyThread2(s);
		t3.start();
		t4.start();
	}
}
