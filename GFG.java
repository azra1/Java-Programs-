import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int T;
		T=sc.nextInt();
		String[] a=new String[100];
		String[] b=new String[100];
		int[] al= new int[100];
		int[] bl=new int[100];
		
		for(int l=0; l<T; l++)
		{
		    a[l]=sc.nextLine();
		    b[l]=sc.nextLine();
		}
		for(int k=0; k<T; k++)
		{
		    al[k]=a[k].length;
		    bl[k]=b[k].length;
		}
	
		int i=0;
		int[] count=new int[100];
		for(int ac=0; ac<T; ac++)
		{
		while(i!=al[ac])
		{
		    for(int j=0; j<bl[ac]; j++)
		    if(a[ac].charAt(i)==b[ac].charAt(j))
		    count[ac]++;
		    
		}
		}
		for(int h=0; h<T; h++)
		{
		if(count[h]==al[h])
		System.out.println("1");
		else
		System.out.println("0");
		}
	}
}