package assignment3;

import java.util.Scanner;

public class ReverseNumberAndString 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num=sc.nextInt();
		int rnum=0;
		while(num>0)
		{
			rnum=rnum*10+num%10;
			num=num/10;
		}
		System.out.print(rnum);
		System.out.print("\nEnter the name:");
		String name=sc.next();
		String rename=" ";
		char ch;
		for(int i=0; i<name.length(); i++)
		{
			ch=name.charAt(i);
			rename=ch+rename;
		}
		System.out.print(rename);
	}

}
