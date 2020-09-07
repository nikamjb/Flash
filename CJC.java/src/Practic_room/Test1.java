package Practic_room;

public class Test1 {
	
	public void display(Customar []c)
	
	{
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i].getEid());
			System.out.println(c[i].getEname());
			System.out.println(c[i].getEaddress());
		}
		
	}

}
