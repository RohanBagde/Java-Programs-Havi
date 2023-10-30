package com.FileHandling;

import java.io.File;

public class GetFileInfo {

	public static void main(String[] args) {
		
		//This program displays the information about the file
		
		File file=new File("C:\\Java IO\\NewFolderJava\\javanotes.txt");
		if(file.exists())
		{
			System.out.println("File Name : "+file.getName()); //display file name
			System.out.println("File Location : "+file.getAbsolutePath());//display file location
			System.out.println("File Writable : "+file.canWrite());//display file writable or not return boolean
			System.out.println("file Readable :"+file.canRead());//display file readable or not return boolean
			System.out.println("file Size :"+file.length());//display file size
			
		}
		else
		{
			System.out.println("File does not exist....! ");
		}

	}
}