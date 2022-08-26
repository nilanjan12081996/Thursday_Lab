package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FileInputStream fs=null;
FileOutputStream os=null;
try {
	fs= new FileInputStream("D:\\Java File\\java.txt");
	os=new FileOutputStream("D:\\Java File\\dest.txt");
int i ;
while((i=fs.read())!=-1)
{
	os.write(i);
	}
System.out.println("Copy successful");
}catch(Exception e)
{System.out.println(e);
	}
finally {
	try {
		if(fs!=null)
			fs.close();
		if(os!=null)
			os.close();
	}catch(Exception e)
	{
		System.out.println(e);
	}
}
	}

}
