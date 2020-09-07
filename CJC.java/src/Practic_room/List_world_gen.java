package Practic_room;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_world_gen {
	
	public static void main(String[] args) {
		List<String> mh=new ArrayList();
		    mh.add("pune");
		    mh.add("mumbai");
		    
		 List<String>jh=new ArrayList();
		  
		             jh.add("Rahch");
		             jh.add("Lohardaga");
		             
		 List<List<String>>  india=new ArrayList();
		                     india.add(mh);
		                     india.add(jh);
		                     
		 List<List<List<String>>>world=new ArrayList();
		                         world.add(india);
		
		                         
		 /* Iterator<List<List<String>>> itr=world.iterator();
		                            while(itr.hasNext())
		                            		{
		                         List country= itr.next();
		                         
		                         Iterator<List<String>>itr1=country.iterator();
		                         while(itr1.hasNext())
		                         {
		                     List   state	= itr1.next();
		                      
		                      Iterator <String>itr2=state.iterator();
		                      while(itr2.hasNext())
		                      { 
		                    	  String city=itr2.next();
		                    	  System.out.println(city);
		                      }
		                         }
		                            		}
		*/
		                            
		       for(List<List<String>>country:world) 
		       {
		    	  for(List<String>state:country)
		    	  {
		    		  for(String city:state)
		    		  {
		    			  System.out.println(city);
		    		  }
		    			  
		       }
		                            
		                            
		                            
		                            
		
	}

	}
}
	
