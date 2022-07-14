package Assignment3;

import java.util.Scanner;

public class RemoveSpaceInString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name=sc.nextLine();
		String []Name =name.split(" ");
		for(int i=0; i<Name.length; i++)
		{
		System.out.print(Name[i]);
		}
	}
}
