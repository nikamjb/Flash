package Practic_room;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Map_World {
	public static void main(String[] args) {
		
	
	
	
	List list=new ArrayList();
	            list.add("abc");
	            list.add("Pqr");
	            
	 Set s=new HashSet();
	            s.add("Set--1");
	            s.add("set--2");
	            
	            
	   Map m=new HashMap(); 
	             m.put("List",list);
	             m.put("Set",s);
	             
	    Set key=m.keySet();
	    Iterator itr=key.iterator();
	    
	    while(itr.hasNext())
	    {
	    	String key1=(String)itr.next();
	    	System.out.println(key1);
	    	
	    	Object o=m.get(key1);
	    	
	    	if(o instanceof List)
	    	{
	   List li=(List)o;
	   Iterator itr1=li.iterator();
	   while(itr1.hasNext())
	   {
		  String data= (String)itr1.next();
		  System.out.println(data);
	   }
	    	}
	   else if(o instanceof Set)
	   {
		  Set se=(Set)o;
		  Iterator itr2=se.iterator();
		  while(itr2.hasNext())
		  {
			  String s1=(String)itr2.next();
			  System.out.println(s1);
	   }
	    	}
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	            
	}
}
