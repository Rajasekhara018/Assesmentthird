package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class LargestAndSmallestElementInAnArray
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array:");
		int size=sc.nextInt();
		int[]num=new int[size];
		System.out.print("Array elements:");
		for(int i=0; i<num.length; i++)
		{
			num[i]=sc.nextInt();
		}
		Arrays.sort(num);
		System.out.print("\nSmallest element in an array:"+num[0]);
		System.out.print("\nLargest element in an array:"+num[num.length-1]);

	}

}
