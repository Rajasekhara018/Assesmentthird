package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class SortingonAnArray 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int size = sc.nextInt();
		int []Num=new int[size];
		System.out.print("Array Elements:");
		for(int i=0; i<Num.length; i++)
		{
			Num[i]=sc.nextInt();
		}
		Arrays.sort(Num);
		/*for(int i=Num.length-1; i>0; i--)
		{
			if(Num[i]<0)
			{
				System.out.print(Num[i]+" ");
			}
		}
		for(int i=0; i<Num.length; i++)
		{
			if(Num[i]>=0)
			{
				System.out.print(Num[i]+" ");
			}*/
		/*System.out.print("Sorting of Array Elements:");
		for(int i=0; i<Num.length; i++)
		{
			System.out.print(Num[i]+" ");
		}
		System.out.print("\nSecond largest number in an array:");
		for(int i=0; i<Num.length; i++)
		{
			if( i==Num.length-2)
			System.out.print(Num[Num.length-2]+" ");
		}
		System.out.print("Check particular element present in array:");*/
		int target=234;
		for(int i=0; i<Num.length; i++)
		{
			if( target==Num[i])
			{
			System.out.print("The Element is present in the Array");
			break;
	     	}
		}
	}

}
