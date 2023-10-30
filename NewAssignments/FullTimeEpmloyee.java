package NewAssignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class DetailsEmp {

}

public class FullTimeEpmloyee {
	public static void main(String[] args) {
		// declare the hashmap
				HashMap<Integer, String> Emp = new HashMap<>();
				boolean loopAgain = true;
				Scanner scan = new Scanner(System.in);
				do {
					// ask for user input for id number
					System.out.print("Enter  Employee ID number:");
					Integer eid = Integer.parseInt(scan.nextLine());

					// ask for user input which corresponds to student name
					System.out.print("Enter  Employee Name:");
					String name = scan.nextLine();
					
					System.out.println("Enter Employee Create Date");
					String date= scan.nextLine();
					
					System.out.println("Enter Employee Date of Birth");
					String Dob= scan.nextLine();
					System.out.println("Enter Employee Age");
					String age=scan.nextLine();
					// add the key value pair from user input to the hashmap

					String oldVal = Emp.put(eid, name+" "+date+" "+Dob+" "+age);
					if (oldVal!=null) {
						System.out.println("Employee Id Number:" + eid + " is "
								+ oldVal + " and has been overwritten by " + name);
					}	
					System.out.print("Enter another Employee (y/n)?");
					String answer = scan.nextLine();
					if (answer.equals("y") || answer.equals("Y")) {
						continue;
					} else {
						break;
					}

				} while (loopAgain);
				scan.close();
				System.out.println("The following students are in database");
				System.out.println("   ID  "+ "     All Data");		
				for(int id:Emp.keySet()){
					System.out.println("   "+id+"    "+Emp.get(id));
				}
				for(String string:Emp.values())
				{
					System.out.println(Emp.get(string));
				}

			}

	}
