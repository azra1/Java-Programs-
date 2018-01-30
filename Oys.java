 class Oys
{
		public static void main(String arg[])
		{
			int n1, n2, a=10000,i=1;
			int suma=0, sumb=0;
			for(a=10000; a<=13000; a++)
			{
				n1=a/2;
				i=1;
				while(i<=n1)
				{
					if(a%i==0)
					{suma=suma+i;
					}
					i++;
					
				}
				//System.out.println(+suma);
			
				i=1;
				n2=suma/2;
				while(i<=n2)
				{
					if(suma%i==0)
					sumb=sumb+i;
					i++;
				}
				//System.out.println(+sumb);
				if(a==sumb)
				System.out.println("The no.is an Osymenn number"+a);
			}
		}
}