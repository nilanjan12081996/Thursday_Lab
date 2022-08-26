package filehandling;

import java.io.FileInputStream;

public class InputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileInputStream fis=new FileInputStream("D:\\Java File\\java.txt ");
int i;
System.out.println("\nRemaining bytes: "+fis.available());
/*while((i=fis.read())!=-1)
{
	System.out.print((char)i);
	}*/
fis.read();
fis.read();
fis.read();
fis.read();
System.out.println("\nRemaining bytes: "+fis.available());
fis.close();
}catch (Exception e) {
	// TODO: handle exception
	System.out.println(e);
}
	}

}
