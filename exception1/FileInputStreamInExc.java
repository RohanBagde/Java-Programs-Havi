package com.exception1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamInExc {

	public static void main(String[] args)throws IOException {
	  FileInputStream fis=null;
	  try {
		  fis=new FileInputStream("d:abc.txt");
	  }
	  catch(FileNotFoundException fnf)
	  {
		  System.out.println("fileNotFound");
	  }
	  finally
	  {
		  if(fis!=null)
		  {
			  fis.close();
		  }
		  System.out.println("file closed");
	  }

	}

}
