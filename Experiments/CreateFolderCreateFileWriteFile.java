package Experiments;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFolderCreateFileWriteFile {

	public static void main(String[] args) {
   
		File f1= new File("C:\\Java IO\\Zabuza");
		boolean b=f1.mkdir();
		if(b)
		{
			System.out.println("folder Created....");
		}
		else
		{
			System.out.println("already exist..");
		}
		try {
			File f2=new File("C:\\Java IO\\Zabuza\\Hunter.txt");
			if(f2.createNewFile())
			{
				System.out.println("file created successfully");
			}
			else
			{
				System.out.println("file already exist");
			}
		}
		catch(IOException io)
		{
			io.printStackTrace();
		}
		try {
			FileWriter f3=new FileWriter("C:\\Java IO\\Zabuza\\Hunter.txt");
			try {
				f3.write("I Am Naruto Uzumaki");
			}
			finally {
				f3.close();
			}
			System.out.println("data written successfully");
			
		} 
		catch (IOException e) 
		{
	
			e.printStackTrace();
		}
		

	}

}
