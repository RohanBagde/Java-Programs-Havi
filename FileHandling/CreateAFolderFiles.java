package com.FileHandling;

import java.io.File;

public class CreateAFolderFiles {

	public static void main(String[] args) {
		// Creating folder in my Directory
		
		File file= new File("C:\\Java IO\\NewFolderJava1"); // Here i need to give path to file object where i want to create folder.
		boolean b=file.mkdir();  //MakeDirectory return true if folder is successfully created
		if(b)     //checking the conditions
		{
			System.out.println("folder created");
		}
		else {
			System.out.println("folder is not created");
		}
		// Once folder is created and again we run the same code then it will print else part
		// we can't create the same folder name in same path

	}

}
