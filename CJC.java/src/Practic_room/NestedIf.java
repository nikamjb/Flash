package Practic_room;

public class NestedIf 
{
	public static void main(String[] args)
	{
	int n=0;
	if(n>0)
	{
		if(n%2==0)
		{
			System.out.println("no. is even");
		}
		else
		{
			System.out.println("no.is odd");
		}
	}
	else if(n<0)
	{
		System.out.println("no.is negetive");
	}
	else
	{
		System.out.println("no. is zero");
	}
	}
}
