package my.collection.demo;

import java.util.Comparator;

public class Employee implements Comparable<Employee>, Comparator<Employee>{
	private int empId;
	private String empName;
	private String empState;
	
	public Employee(int empid,String empName,String empState){
		this.empId = empid;
		this.empName = empName;
		this.empState = empState;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpState() {
		return empState;
	}
	public void setEmpState(String empState) {
		this.empState = empState;
	}
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.empName.compareTo(o2.empName);
	}
	
	public String toString(){
		return empId + " " +empName+"  "+empState;
	}
	@Override
	public int compareTo(Employee o) {
		return empName.compareTo(o.getEmpName());
	}
	@Override 
	public boolean equals(Object other)
	{ 
		if(this == other) 
			return true; 
		if(other == null || (this.getClass() != other.getClass())){
			return false; 
		} 
		Employee emp = (Employee) other; 
		return (this.empId == emp.getEmpId()) && 
				(this.empName != null && empName.equals(emp.getEmpName())); 
				
	}
	
	@Override 
	public int hashCode(){
		int result = 0; 
		result = 3*result + empId; 
		result = 3*result + (empName !=null ? empName.hashCode() : 0); 
		return result; 
	} 

	
	

}
