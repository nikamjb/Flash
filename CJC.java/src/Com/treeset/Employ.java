package Com.treeset;

import java.util.Comparator;

public class Employ implements Comparator{
	
	private int eid;
	private String ename;
	private String eaddr;
	private double esalary;
	
	
	public double getEsalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	@Override
	public int compare(Object o1, Object o2) {
		Employ emp1=(Employ)o1;
		Employ emp2=(Employ)o2;
		return -(emp1.ename.compareTo(emp2.ename));
	}
	
	

}
