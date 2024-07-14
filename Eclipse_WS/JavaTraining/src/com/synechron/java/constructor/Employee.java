package com.synechron.java.constructor;

import com.synechron.java.variables.Person;

public class Employee extends Person
{
	public String empID;
	public String empEmail;
	public String empAddress;
	public String companyAddrss;
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = "Employee informatin are" + 
		"\n Employee ID " + this.empID + 
		"\n Employee Email " + this.empEmail + 
		"\n Employee Address " + this.empAddress + 
		"\n Company Address " + this.companyAddrss +
		"\n *******************************************\n"; 
		
		
		return super.toString() + str;
	}
	
	public Employee() {
		System.out.println("This is the default Constructor!!!");
		
	}
	
	public Employee(String name, double ht, double wt, long phonenum, String empID, String empEmail,String empAddr,
			String companyAddr)
	{
		this.name = name;
		this.phoneNumber = phonenum;
		this.height = ht;
		this.weight = wt;
		this.empID = empID;
		this.empEmail = empEmail;
		this.empAddress = empAddr;
		this.companyAddrss = companyAddr;
		
	}
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		System.out.println(emp.empID);
		
	
		Employee emp2 = new Employee("Aravinda",5.8,76,885589898,"emp123","emp1@synechron.com","bangalore", "Ring road Bangalore");
		Employee emp3 = new Employee("Harry",3.8,86,882289898,"emp124","emp2@synechron.com","bangalore", "Ring road Bangalore");
		Employee emp4 = new Employee("Manu",5.9,76,885981198,"emp153","emp3@synechron.com","bangalore", "Ring road Bangalore");
		Employee emp5 = new Employee("Kotresh",4.8,70,885334898,"emp143","emp4@synechron.com","bangalore", "Ring road Bangalore");
		
		
		
		
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		System.out.println(emp5);
	}
	
	

}
