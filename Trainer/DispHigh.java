package Trainer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
class Employee1{
	String name;
	double salary;
	String address;
	public Employee1(String n,double s, String a) 
	{
		this.name=n;
		this.salary=s;               //	Display the highest salary employee details from the list of employees.
		this.address=a;
	}
}
public class DispHigh {

	
	
	public static void main(String[] args) {
		ArrayList<Employee1> lis=new ArrayList<Employee1>();
		lis.add(new Employee1("Naruto",10000,"Tokyo"));
		lis.add(new Employee1("Kakashi",12000,"Hiroshima"));
		lis.add(new Employee1("Denzi",20000,"Nagasaki"));
		lis.add(new Employee1("Riyutsu",17000,"kyato"));
		lis.add(new Employee1("Itachi",24000,"yokohama"));
		
		Iterator<Employee1> leo =lis.iterator();   
		double ms=0;
		String name=null;
		String address=null;
		if(leo.hasNext())
		{
			Employee1 em=leo.next();
			ms=em.salary;
		}
		Iterator<Employee1> leo1= lis.iterator();
		while(leo1.hasNext())
		{
			Employee1 em1=leo1.next();
			if(ms<=em1.salary) 
			{
				ms=em1.salary;
				name=em1.name;
				address=em1.address;
			}
			
		}
		System.out.println("Name"+"   "+"Address"+" "+"Salary");		
		System.out.println(name+" "+address+" "+ms);
		
		
	}

}
