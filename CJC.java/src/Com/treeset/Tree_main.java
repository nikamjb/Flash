package Com.treeset;

import java.util.Set;
import java.util.TreeSet;

import Practic_room.main;

public class Tree_main {
	public static void main(String[] args) {
		
	
	
	Employ e=new Employ();
	       e.setEid(101);
	       e.setEname("jalindar");
	       e.setEaddr("Pune");
	       e.setEsalary(25000.50);
	       
	 Employ e1=new Employ ();
	         e1.setEid(102);
	         e1.setEname("Rahul");
	         e1.setEaddr("Mumbai");
	         e.setEsalary(24000.10);
	         
	 Employ emp2=new Employ();
	        emp2.setEid(103);
	        emp2.setEname("pramod");
	        emp2.setEaddr("Aurangabad");
	        emp2.setEsalary(23400.10);
	        
	        Set<Employ>s=new TreeSet(new Employ());
	                   s.add(e);
	                   s.add(e1);
	                   s.add(emp2);
	                   
	                   for(Employ emp:s)
	                   {
	                	 System.out.println(emp.getEid());
	                	 System.out.println(emp.getEname());
	                	 System.out.println(emp.getEaddr());
	                	 System.out.println(emp.getEsalary());
	                   }
}
}