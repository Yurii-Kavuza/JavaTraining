package com.practicaljava.lesson16.tryit;

import java.io.*;
import java.util.zip.*;

public class ReadZip {

	public static void main(String[] args) {
		 try(FileInputStream fistr = new FileInputStream("Desktop.zip");
			BufferedInputStream bistr = new BufferedInputStream(fistr);
			ZipInputStream zistr = new ZipInputStream(bistr)) {		    
		     
			 ZipEntry entry;		     
		     String name;
		     
		     while ((entry=zistr.getNextEntry()) != null) {
		    	 name = entry.getName();
		    	 System.out.println(name);		    	 
		    	 zistr.closeEntry();
		     }
		     
		} catch (IOException e) { 
			System.out.println(e);
		}
	}
}
