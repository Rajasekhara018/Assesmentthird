package assignment3;

import java.util.Scanner;

public class NearestPrimeNumber 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int dcount=0;
		int icount=0;
		int fcount=0;
		int i;
		int k;
		for(i=num; i>=1; i--)
		{
			dcount++;
			fcount=0;
			for(int j=1; j<=num; j++)
			{
				if(i%j==0)
				{
				fcount++;
				}
			}
			if(fcount==2)
			{
				break;
			}
		}
		for(k=num+1;  ; k++)
		{
			icount++;
			fcount=0;
			for(int j=1; j<=num; j++)
			{
				if(k%j==0)
				{
				fcount++;
				}
			}
			if(fcount==2)
			{
				break;
			}
		}
		if(dcount<icount)
		{
			System.out.print(i);
		}
		else if(icount==dcount)
		{
			System.out.print(i+" "+k);
		}
		else
		{
			System.out.print(k);
		}
	}
}
