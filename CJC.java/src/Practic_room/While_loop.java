package Practic_room;

import java.util.Scanner;

public class While_loop {
	
	public static void main(String[] args) {
		
		int a[]=new int [5];
		
		Scanner sc=new Scanner (System.in);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter array element");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<2;i++)
		{
			for(int j=i+1;j<a.length;j++)
		
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					   a[i]=a[j];
					   a[j]=temp;
					   
				}
			}
		
			
		
		/*
		 * int large=a[0]; for (int i=0;i<a.length;i++) { if(large<a[i]) { large=a[i]; }
		 * 
		 * }
		 */
		}
		System.out.println("2nd largestno="+ (2-1));
	
	}
}

	


