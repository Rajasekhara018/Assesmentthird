package Assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListContainsSomeNumbersPrintEvenNumbers
{

	public static void main(String[] args)
	{
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter the size of the Array:");
	      int size=sc.nextInt();
	      int []Array = new int[size];
	      System.out.print("Arraylist elements:");
	      for(int i=0; i<Array.length; i++)
	      {
	    	  Array[i]=sc.nextInt();
	      }
	      ArrayList<Integer> num = new ArrayList<Integer>();
	      System.out.print("Even Numbers from ArrayList:");
	      for(int i=0; i<Array.length; i++)
	      {
	    	  if(Array[i]%2==0)
	    	  {
	    		  num.add(Array[i]);
	    	  }
	    	  
	      }
	      System.out.print(num);
		
		
	}

}
