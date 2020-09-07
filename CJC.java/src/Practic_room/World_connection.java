package Practic_room;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class World_connection 
{
	public static void main(String[] args) {
		
	
List<String> mh=new ArrayList<>();
     mh.add("pune");
     mh.add("mumbai");
     mh.add("aurangabad");
     
 List<String> jh=new ArrayList<>();
      jh.add("Ranchi");
      jh.add("Lohardaga");
      jh.add("Gumla");
      
      
 List<String> mp=new ArrayList<>();
           mp.add("Jabalput");
           mp.add("Indor");
           mp.add("Reva");
           
 List<String> Akita=new ArrayList<>();
      Akita.add("Akita--1");
      Akita.add("Akita---2");
      Akita.add("Akita---3");
 
 
 List <String> Chiba=new ArrayList<>();
      Chiba.add("Chiba--1");
      Chiba.add("Chiba--2");
      Chiba.add("Chiba--3");
      
 List<String> Gifu=new ArrayList<>();
      Gifu.add("Gifu---1");
      Gifu.add("Gifu--2");
      Gifu.add("Gifu---3");
      
  List <List<String>>india=new ArrayList<>();
       india.add(mh);
       india.add(jh);
       india.add(mp);
       
       
       List <List<String>>japan=new ArrayList<>();
            japan.add(Gifu);
            japan.add(Chiba);
            japan.add(Akita);
 
    List <List<List<String>>>world=new ArrayList();
         world.add(india);
         world.add(japan);
         
         Iterator<List<List<String>>> itr=world.iterator();
         while(itr.hasNext())
         {
        List country= itr.next();
        Iterator<List<String>> itr1=country.iterator();
        while(itr1.hasNext())
        {
        List state=itr1.next();
          Iterator<String> itr2=state.iterator();
          while(itr2.hasNext())
          {
        	String  city=itr2.next();
        	System.out.println(city);
          }
         
        }
        
         }
         
        //using 		 
      for(List<List<String>> country:world) 
      {
    	  for(List<String> state:country)
    	  {
    		 for(String city:state) 
    		 {
    			 System.out.println(city);
    		 }
    	  }
      }
       
         
         
         
	}
}
