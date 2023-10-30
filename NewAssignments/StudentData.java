package NewAssignments;
import java.util.ArrayList;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
class StudentDetails{
	private int id;
	private String name;
	private int marks; 
	StudentDetails(int id, String name,int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
	public String toString()
	{
		return id+" "+name+" "+marks;
	}	
}
public class StudentData {	
	public static void main(String[] args)  throws NumberFormatException{
		Collection<StudentDetails> collect= new ArrayList<StudentDetails>();
		Scanner sc =new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
	 int choice=0;
	 do {
		 System.out.println("Enter 1 for add the data");
		 System.out.println("Enter 2 for display the data");
		 System.out.println("Enter 3 for display the data by student id");
		 System.out.println("Enter 0 for exit from program");
		 System.out.println("Enter your choice :-");
		 try {
			 choice=sc.nextInt();
			 if(choice<0 || choice>4)
			   System.out.println("Please enter positive integer value in between 0 to 4 as above instructed...");
			   System.out.println("============================================================================");
		 }
		 catch(InputMismatchException e)
		 {
			 System.out.println("Please enter integer values only...");
		 }
		 
		 switch(choice)
		 {
		 case 1:
			 System.out.print("Enter the student id : ");
			 int sid = 0; String sname = null; int smarks=0;
			 try {
				 sid= sc.nextInt();
			 }
			 catch(InputMismatchException  e)
			 {
				 System.out.println("please enter positive integer value only");
				 
			 }			
			 System.out.print("Enter the student name :");
			 sname=sc1.nextLine();   //i dont know why it is accepting Intgers values
//			 boolean isnumeric=true;
//			 try {
//				 int a= Integer.parseInt(sname);
//			 }
//			 catch(InputMismatchException e)
//			 {
//				 System.out.println("Enter string value only");
//				 isnumeric=false;
//			 }
//			 if(isnumeric)
//			 {
//				 System.out.println("enter string only... please rerun your program");
//				 System.exit(0);
//			 }	
			 
//==========================================================================			 
//			 int sname2=Integer.parseInt(sname);
//			 if(sname2<=0 || sname2>=999999999)
//			 {
//				 System.out.println("please dont enter numeric values as name");			 
//			 }
			 System.out.print("Enter the Student marks :");
			 try {
				 smarks=sc.nextInt();
			 	 }
			 catch(InputMismatchException e)
			 {
				 System.out.println("marks cant be string or aplphanumeric...");
			 }
			
			 System.out.println("Data inserted successfully....");
			 System.out.println("=======================================");
			 collect.add(new StudentDetails(sid,sname,smarks));
		 break;		 		 
		 case 2:

			 if(collect.isEmpty())
			 {
				 System.out.println("Insert the data first...");
				 
			 }
			 Iterator <StudentDetails> i= collect.iterator();
			 while(i.hasNext())
			 {
				 StudentDetails e =i.next();
				 System.out.println("id name marks");
				 System.out.println(e+"  ");
				 System.out.println("--------------------");
			 }
			 break;
		 case 3:
			 if(collect.isEmpty())
			 {
				 System.out.println("Insert the data first....");
			 }
			 boolean flag=false;
			 System.out.println("please Enter the student id :");
			 sid=0;
			 try {
				 sid=sc.nextInt();
				 }
			 catch(InputMismatchException e)
			 {
				 System.out.println("Please enter positive integer value only");
				 System.exit(0);
			 }
			 i=collect.iterator();
			 while(i.hasNext())
			 {
				 StudentDetails e =i.next();
				 if(e.getId()==sid)
				 {
					 flag=true;
					 System.out.println(e);
				 }			     
			 }
			 if(!flag)
			 {
				 System.out.println("id not found");
			 }
			 System.out.println("================================================================");
			 break;
		 }
	 }
	 while(choice!=0);
	 System.out.println("Thank you for using my application....");
	 
	}
}

