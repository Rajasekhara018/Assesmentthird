package array;

import java.util.Scanner;

public class HCFofArrayElements 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int size=sc.nextInt();
		int []num =new int[size];
		System.out.print("Enter the array elements:");
		for(int i=0; i<num.length; i++)
		{
			num[i]=sc.nextInt();
		}
		int min=num[0];
		for(int i=0; i<num.length; i++)
		{
			if(num[i]<min)
			{
				min=num[i];
			}
		}
		System.out.print("min:"+min);
		System.out.print("\nHCF of the Array elements:");
		for(int i=min; i>=1; i--)
		{
			int count=0;
			for(int j=0; j<num.length; j++)
			{
				if(num[j]%i==0)
				{
					count++;
				}
			}
			if(count==num.length)
			{
				System.out.print(i);
				break;
			}
		}

	}

}
