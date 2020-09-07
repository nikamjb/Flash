package Practic_room;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Map_Test {
	
	public static void main(String[] args) {
		List<String>mh=new ArrayList();
		            mh.add("pune");
		            mh.add("mumbai");
		            
		 List<String> jh=new ArrayList();
		               jh.add("Ranchi");
		               jh.add("Lohardaga");
		               
		   Map<String,List<String>> india=new HashMap();
		         india.put("State1", mh);
		         india.put("State2", jh);
		         
		         Set<String>keys=india.keySet();
		                  System.out.println(keys);
		                  Iterator<String>itr=keys.iterator();
		                  while(itr.hasNext())
		                  {
		                	  String val=itr.next();
		                	  System.out.println(val);
		                	  
		                	  List<String> state=india.get(val);
		                	  Iterator<String>itr1=state.iterator();
		                	  while(itr1.hasNext())
		                	  {
		                		  String s=itr1.next();
		                		  System.out.println(s);
		                		  
		                	  }
		                	  
		                  }
		
  }
  

		 }
		
		    
	


