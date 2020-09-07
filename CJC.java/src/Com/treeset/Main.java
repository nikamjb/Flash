package Com.treeset;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	
	public static void main(String[] args) {
		int x=1;
		Set <Employ>s=null;
		Scanner sc=new Scanner (System.in);
		while(true)
		{
		System.out.println("Enter your choise");
		System.out.println("1.Id Sort \n2.Name sort\n3.Salary Sort\n4.Reverse Sort");
		int ch=sc.nextInt();
		
		switch (ch)
		{
		case 1:
			s=new TreeSet<>(new IdSort());
			break;
			
		case 2:
			s=new TreeSet<>(new NameSort());
			break;
			
		case 3:
			s=new TreeSet<>(new SalarySort());
			break;
		case 4:
			s=new TreeSet<>(new ReverceSort());
			break;
			
		}
		
				
		Employ emp=new Employ();
		     emp.setEid(101);
		     emp.setEname("Jalindar");
		     emp.setEaddr("pune");
		     emp.setEsalary(25000.10);
		     
		Employ  emp1=new Employ();
		        emp1.setEid(102);
		        emp1.setEname("rahul");
		        emp1.setEaddr("mumbai");
		        emp1.setEsalary(24100.25);
		        
		 Employ emp2=new Employ();
		        emp2.setEid(103);
		        emp2.setEname("pramod");
		        emp2.setEaddr("Aurangabad");
		        emp2.setEsalary(23900.10);
		        
		        s.add(emp);
		        s.add(emp1);
		        s.add(emp2);
		        
		        for(Employ empl:s)
		        {
		        	System.out.println("Employ"+x);
		        	System.out.println(empl.getEid());
		        	System.out.println(empl.getEname());
		        	System.out.println(empl.getEaddr());
		        	System.out.println(empl.getEsalary());
		        	System.out.println("");
		        	x++;
		        	
		        }
		       
	}
		
	}
}
