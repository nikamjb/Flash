
package com.rbi.Admin;

import java.util.Scanner;

import com.rbi.operation.Operation;


public class Main{
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Operation op=new  Operation();
		      while(true)  {
		    	  System.out.println("chuse the option");
		System.out.println("1 creat acc \n 2.show acc detail \n 3. diposit money \n 4 withroa \n 5.balance Enquiri");
		System.out.println("");
		int a=sc.nextInt();
		
		switch (a)
		{
		case 1:
op.creatacc();
			//System.out.println(");
			break;
			
		case 2:
			op.showacc();
			
			break;
		case 3:
			op.diposit();
			System.out.println("5.balance enquiry");
			break;
			
		case 4:
			op.Withroal();
			break;
			
		case 5:
			op.blance();
			break;
		}
			
		
		      }
		
	}

}
