/*wap to check whether a character is uppercase or lowercase.*/
package basicprogram;

import java.util.Scanner;

public class UpperAndLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char character;
		System.out.println("Input a Character");
		Scanner obj=new Scanner(System.in);
		character=obj.next().charAt(0);
		if(character>='A'&&character<='Z')
			System.out.println(character+" is in uppercase");
		else if(character>='a'&&character<='z')
			System.out.println(character+" is in lowercase");
		

	}

}
