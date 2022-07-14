package array;

public class Searching {

	public static void main(String[] args)
	{
	int num[]= {2,3,4,5,6};
	int snum=5;
	for(int i=0; i<num.length; i++)
	{
		if(snum==num[i])
		{
			System.out.print("Found");
		}
		else if(snum!=num[i])
		{
			System.out.print("Not found");
		}
	}
	}

}
