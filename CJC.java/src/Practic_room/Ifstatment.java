
package Practic_room;

public class Ifstatment 
{

	public static void main(String args[])
	{

	System.out.println("main start");
	
	int marks=90;
	
	if(marks<=50)
	{
		System.out.println("fail");
	}
	else if(marks>=50 && marks<60)
	{
		System.out.println("pass in C graid");
	}
	else if(marks>=70 && marks<80) 
	{
		System.out.println("pass in B graid");
		
	}
	else if(marks>=80 && marks<=90)
	{
		System.out.println("pass in A graid");
	}
	else
	{
		System.out.println("not found");
	}
	System.out.println("main end");
	}
}
