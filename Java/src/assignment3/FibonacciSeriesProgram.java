package assignment3;

import java.util.Scanner;

public class FibonacciSeriesProgram 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Fibonacci values:");
		int ivalue=0;
		int svalue=1;
		int tvalue;
		int num=sc.nextInt();
		System.out.print("Fibonacci values:");
		for(int i=0; i<num; i++)
		{
			System.out.print(ivalue+" ");
			tvalue=ivalue+svalue;
			ivalue=svalue;
			svalue=tvalue;
		}

	}

}
