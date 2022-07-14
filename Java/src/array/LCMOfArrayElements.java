package array;

import java.util.Scanner;

public class LCMOfArrayElements 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array");
		int size = sc.nextInt();
		
		int []num =new int[size];
		int i=0;
		int max=num[0];
		System.out.print("Enter the array elements in an Array:");
		for(i=0; i<num.length; i++)
		{
			num[i]=sc.nextInt();
			if(num[i]>max)
			{
				max=num[i];
			}
		}
		System.out.print("max"+max);
		System.out.print("\nLCM of Array elements:");
		for(i=max;  ; i=i+max)
		{
			int count=0;
			for(int j=0; j<num.length; j++)
			{
				if(i%num[j]==0)
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
