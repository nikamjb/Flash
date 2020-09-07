package Practic_room;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A

{
	public void hello(String s)
	{
		 System.out.println(s);
	}
	
	public void hello(StringBuffer s)
	{
		System.out.println(s);
	}
	public void hello (Object o)
	{
		System.out.println(o);
	}
	public static void main(String[] args) 
	{
		A a=new A();
		a.hello(10);
		a.hello("jalu");
		a.hello("sai");
		
		
	


	}    
	     
	

}
	
