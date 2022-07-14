package Assignment3;

import java.util.Scanner;

public class ConsonantsAndVowelsInAnArray 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name:");
		String Name=sc.next();
		int Vcount=0;
		int Ccount=0;
		String name=Name.toLowerCase();
		for(int i=0; i<name.length(); i++)
		{
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
			{
				Vcount++;
			}
		else if(name.charAt(i)<='a' || name.charAt(i)<='z' )
		{
			Ccount++;
		}
		}
		System.out.print("\nConsonants Count:"+Ccount);
		System.out.print("\nVowels Count:"+Vcount);	
	}

}
