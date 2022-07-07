/*write a program to input any alphabet and 
 * check whether its vowel or consonant.*/
package basicprogram;
import java.util.*;
public class VowelOrConsonenet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char character;
		System.out.println("Input a Character");
		Scanner obj=new Scanner(System.in);
		character=obj.next().charAt(0);
		if(character=='a'||character=='e'||character=='i'||character=='o'||character=='u'||character=='A'||character=='E'||
				character=='I'||character=='O'||character=='U')
			System.out.println(character+" is a Vowel");
		else
			System.out.println(character+" is a Consonant");

	}

}
