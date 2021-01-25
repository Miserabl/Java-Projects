/*
 * Phone word Convereter
 * Aryan Misra 28 June, 2020
 * 
 * Get a word from the user 
 * Capitalize it to make it easier to handle
 * Initlaize a new string that will contain the final number
 * use a for loop to iterate through the word from the user using char
 * if the char is a digit, add the digit to the final number string
 * Otherwise use a swtich case to convert letters to a digit
 *  add that digit to the final number string
 * Add a default case to account for dashes or other special characters, which does nothing
 * After the for loop, check if the final number string is greater than or equal to 7
 * If it is, print out the first 7 digits
 * If not, print an error
 * 
 */

import java.util.Scanner;

public class PhoneWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" What's your phone word? ");
        String word = input.nextLine();
        String newWord = "";
        word = word.toUpperCase();
        for ( int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			if ( letter >= '0' && letter <= '9') {
				newWord += letter;
			} else {
				switch(letter) {
					case 'A':
					case 'B':
					case 'C':
						newWord += "2";
						break;
					case 'D':
					case 'E':
					case 'F':
						newWord += "3";
						break;
					case 'G':
					case 'H':
					case 'I':
						newWord += "4";
						break;
					case 'J':
					case 'K':
					case 'L':
						newWord += "5";
						break;
					case 'M':
					case 'N':
					case 'O':
						newWord += "6";
						break;
					case 'P':
					case 'Q':
					case 'R':
					case 'S':
						newWord += "7";
						break;
					case 'T':
					case 'U':
					case 'V':
						newWord += "8";
						break;
					case 'W':
					case 'X':
					case 'Y':
					case 'Z':
						newWord += "9";
						break;
					
				}
			}
			
			
			
		}
        if (newWord.length() >= 7) {
			newWord = newWord.substring(0,7);
			System.out.println(newWord);
			System.out.println();
		}
		else {
			System.out.println(" Your phone word is not long enough to be a number");
			System.out.println();
		}
		
		 input.close();	
	}
}


