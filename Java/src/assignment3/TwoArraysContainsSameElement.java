package assignment3;

public class TwoArraysContainsSameElement
{

	public static void main(String[] args)
	{
		int[]list1 = {1,2,3,4,5};
		int[] list2 = {1,2,3,4,5,6};
		int count=0;
		for(int i=0; i<list1.length; i++)
		{
			for(int j=0; j<list2.length; j++)
			{
				if(list1[i]==list2[j])
				{
					//System.out.print("The arrays contains common number");
					count++;
				}
			}
		}
		if(count==list1.length)
		{
			System.out.print("The arrays contains common numbers");
		}
		else
		{
			System.out.print("The arrays contains different numbers");
		}

	}

}
