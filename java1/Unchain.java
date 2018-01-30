class Unchain
{
		void get()
		{
			int x=10/0;
			try
			{
				throw new ArithmeticException("Divide by 0");
			}
			catch(Exception e)
			{
			}
		}
		void show()
		{
			get();
		}
		public static void main(String arg[])
		{
			Unchain ob= new Unchain();
			/*try
			{
				ob.show();
			}
			catch(Exception e)
			{
				System.out.println("Caught in main");
			}*/
		}
}