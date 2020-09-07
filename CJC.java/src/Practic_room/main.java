package Practic_room;

import java.util.Scanner;

public class main {
	
  public static void main(String[] args) 
  {

	  
	  Customar[] e=new Customar[1];
	  Scanner sc=new Scanner(System.in);
	  
	  for(int i=0;i<e.length;i++)
	  {
		  Customar emp=new Customar();
		  System.out.println("Enter eid");
		   int eid= sc.nextInt();
		    emp.setEid(eid);
		    
		    System.out.println("enter name");
		    String ename=sc.next();
		      emp.setEname(ename);
		      System.out.println("enter address");
		      String addres=sc.next();
		      emp.setEaddress(addres);
		 
		    e[i]=emp;
		    
	  }
	  Test1 t=new Test1();
	    t.display(e);
	  
}

}
