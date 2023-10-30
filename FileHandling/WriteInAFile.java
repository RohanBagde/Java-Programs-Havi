package com.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteInAFile {

	public static void main(String[] args) {
		try {
			FileWriter f1= new FileWriter("C:\\Java IO\\NewFolderJava\\JavaWrite.txt");
			try 
			{
				f1.write("I am Naruto Uzumaki ");
			}
			finally 
			{
				f1.close();
			}
			System.out.println("Data Written Successfully");
				
		  } 
		catch (IOException io) 
		{
				System.out.println(io);
		}

	}

}
