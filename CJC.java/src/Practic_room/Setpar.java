package Practic_room;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Setpar {
	public static void main(String[] args) {
		List<String> s = new ArrayList<>();
					   	s.add("abc");
						s.add("def");
						s.add("abc");
						s.add("lmn");
						s.add("pqr");
						s.add("def");
						s.add("5");
		
		  System.out.println(s);
		  
		  Set<String> s1=new HashSet<>(s); System.out.println(s1);
		  
		  
		  Set<String> s2= new LinkedHashSet<>(s); System.out.println(s2);
		 

	}

}
