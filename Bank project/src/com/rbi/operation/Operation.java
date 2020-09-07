package com.rbi.operation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.rbi.model.Account;

public class Operation {
	
		
		Scanner sc=new Scanner (System.in);
		Account ac=new Account();

		public void creatacc()
		{
			while(true)
				
			{
				Scanner sc2=new Scanner(System.in);
			System.out.println("Account No=");
			String s=sc2.next();
			Pattern p=Pattern.compile("[A-Za-z0-9]{6,}");
			 Matcher m=p.matcher(s);
			 
			 if(m.find()&&m.group().equals(s))
			 {
				 ac.setAccno(s);
				 System.out.println("match found");
			break;
			 }
			 else
			 {
				 System.out.println("not found");
				 
			 }
			 }
			
			System.out.println("Name=");
			ac.setName(sc.next());
			System.out.println("Id=");
			ac.setId(sc.next());
			System.out.println("address");
			ac.setAddress(sc.next());
			System.out.println("Passward=");
			ac.setPass(sc.next());	
			while(true) {
			System.out.println("enter money");
			double money=sc.nextDouble();
			if(money >= 500)
			{
				ac.setMoney(money);
				break;
				
			}
			else
			{
				System.out.println("Deposit money most be greater than 500");
			  }
			}
			System.out.println("done");	
		}
		
		
		public void diposit()
		
		{
			if(ac.getAccno()==null)
		{
			System.out.println("plz create account");
		}
		
		else {
			System.out.println("Enter the account no");
			String y=sc.next();
		if(y==ac.getAccno())
				{
			System.out.println("Enter the Amount=");
			double x=sc.nextDouble();
			
			if(x>0)
			{
				double total=ac.getMoney()+x;
				ac.setMoney(total);
				System.out.println("total balance is="+total);
				
			}
			else
			{
				System.out.println("enter the amount greater than zero");
			}
			
		}
		else
		{
			System.out.println("Enter the correct account no.");
			diposit();
		}
		
		}
		
		
		System.out.println(" ");
		
		}
		
		public void Withroal()
		
		{
			if(ac.getAccno()==null)
			{
				System.out.println("plz creat account");
			}
			 if(ac.getMoney()<=500)
			{
				System.out.println("not withroal");
			}
			
			else
			{
		    System.out.println("Enter the Account no.");
		   String y=sc.next();
		      if(y==ac.getAccno())
			  System.out.println("Enter the amount=");
			  double x=sc.nextDouble();
			    if(x>0)
			    {
				double total=ac.getMoney()-x;
				ac.setMoney(total);
				System.out.println("total balance is="+ac.getMoney());
			  }
			else 
			{
				System.out.println(" amount less than zero");
			}
		
			
			System.out.println(" ");
		}
		
		}
		
		public void blance()
		{
			if(ac.getAccno()==null)
			{
				System.out.println("plz creat account");
			}
			else
			{
		System.out.println("total balance="+ac.getMoney());
			}
			System.out.println(" ");
		}
		
		public void showacc()
		{
			while(true)
			{
			System.out.println("Enter the account no");
			String s=sc.next();
			if(ac.getAccno().equals(s))
			{
				System.out.println("Name="+ac.getName());
				System.out.println("Account no="+ac.getAccno());
				System.out.println("Address="+ac.getAddress());
				System.out.println("Id="+ac.getId());
				System.out.println("Passward="+ac.getPass());
				System.out.println("Diposit money="+ac.getMoney()); 
				break;
			}
			else
			{
			
			System.out.println("plzz Enter the curect account");
			
			}
			}
		}
	

}
