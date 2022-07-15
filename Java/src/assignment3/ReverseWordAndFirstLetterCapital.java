package assignment3;

import java.util.Scanner;

public class ReverseWordAndFirstLetterCapital
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name:");
		String name=sc.nextLine();
		String word ;
		String rword=" ";
		String cname=" ";
		String []Name =name.split(" ");
		for(int i=0; i<Name.length; i++)
		{
		    word = Name[i];
			rword=" ";
			for(int j=0; j<word.length(); j++)
			{
				char ch=word.charAt(j);
				rword = ch+rword;
			}
			System.out.print(rword);
		}
		System.out.println();
		for(int k=0; k<rword.length(); k++)
		{
			if(k%2==0)
			{
				cname=rword.substring(k+1,k+2).toUpperCase();
		
			}
			else
			{
				cname=rword.substring(k+1,k+2).toLowerCase();
			}
			System.out.print(cname);
			
		}
		System.out.print(cname);
	}
}
