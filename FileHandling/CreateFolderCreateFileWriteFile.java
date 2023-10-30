package com.FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFolderCreateFileWriteFile {

	public static void main(String[] args) {

		File file = new File("C:\\Java IO\\Experiment"); //folder created
		boolean b = file.mkdir();  //path created
		if (b) {
			System.out.println("created");
		} else {
			System.out.println("not created");
		}

		try {
			File file1 = new File("C:\\Java IO\\Experiment\\exp.txt");//file created
			if (file1.createNewFile()) {
				System.out.println("file created successfully");
			} else {
				System.out.println("file already exist");
			}
		} catch (java.lang.Exception e) {

			e.printStackTrace();
		}
		try {
			FileWriter file3 = new FileWriter("C:\\Java IO\\Experiment\\exp.txt");// data  written
			try {
				file3.write("I Am Ninja Boy Rantaro");
			} finally {
				file3.close(); //closing file
			}
			System.out.println("data written successfully");

		} 
		catch (IOException f) 
		{
			f.printStackTrace();
		}		

	}

}
