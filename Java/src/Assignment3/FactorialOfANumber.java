package Assignment3;

import java.util.Scanner;

public class FactorialOfANumber 
{

	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		System.out.print("Factorials of a number");
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
			}
		}

	}

}
