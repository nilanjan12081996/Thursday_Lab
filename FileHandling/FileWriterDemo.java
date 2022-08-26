package filehandling;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) {
//	try {
//		FileWriter fw=new FileWriter("D:\\Java File\\java.txt");
//		fw.write("My name is Nilanjan");
//		fw.close();
//		
//	}catch(Exception e)
//	{
//		System.out.println(e);
//	}
//	System.out.println("Writing success");
		
		//read from file
		try{
		FileReader fr=new FileReader("D:\\Java File\\java.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
			
		}
		fr.close();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
