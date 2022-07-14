package assignment3;

import java.util.Scanner;

public class ArmStrongNumber
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int temp=num;
		int renum=0;
		int sum=0;
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		//System.out.print(count);
		num=temp;
		while(num>0)
		{
			renum=num%10;
			num=num/10;
			sum=sum+(int)Math.pow(renum,count);
		}
		//System.out.print(sum);
		if(sum==temp)
		{
			System.out.print("true");
		}
		else
		{
			System.out.print("false");
		}

	}

}
