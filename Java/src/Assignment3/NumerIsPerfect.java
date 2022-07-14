package Assignment3;

import java.util.Scanner;

public class NumerIsPerfect 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1; i<num; i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
				//System.out.print(i+" ");
			}
		}
		//System.out.print(sum);
		if(sum==num)
		{
			System.out.print("perfect number");
		}
		else
		{
			System.out.print("its not a perfect number");
		}

	}

}
