package com.FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateAFile {

	public static void main(String[] args) {
		// Creating file in my Directory 
		
		
		try {
			File file = new File("C:\\Java IO\\NewFolderJava\\javanotes.txt");  //path,name, and type of file 
			if (file.createNewFile()) 
			{
				System.out.println("fileCreatedSuccessfully" + file.getName());
			} else 
			{
				System.out.println("file is not created");
			}
		}
		catch (IOException io) {
			System.out.println("Error");
			io.printStackTrace();
		}

	}

}
