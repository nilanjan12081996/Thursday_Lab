package filehandling;
import java.io.File;
import java.io.FileOutputStream;
public class FileOutpuStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fis= new FileOutputStream("D:\\Java File\\java.txt");
			//fis.write(56);
			String s="Welcome to java stream";
			byte b[]=s.getBytes();
			fis.write(b);
			fis.close();
			System.out.println("success");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
