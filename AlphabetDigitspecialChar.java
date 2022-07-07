/*wap to input any character and check whether
 *  its alphabet,digit or special character.*/
package basicprogram;

import java.util.Scanner;

public class AlphabetDigitspecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char character;
		System.out.println("Input a Character");
		Scanner obj=new Scanner(System.in);
		character=obj.next().charAt(0);
		if((character>='A'&&character<='Z')||character>='a'&&character<='z')
			System.out.println(character+" is alphabet");
		else if(character>='0'&&character<='9')
			System.out.println(character+" is a Digit");
		else
			System.out.println(character+" is a Special character");
			

	}

}
