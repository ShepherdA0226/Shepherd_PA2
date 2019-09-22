package shepherd_p1;

import java.util.Scanner;


public class Encrypt {

	public static void main(String[] args) {
		
		int temp;
		int number = 0;
		int digit1 = 0;
		int digit2 = 0;
		int digit3 = 0;
		int digit4 = 0;
		int input;
		//initializing variables
		
		Scanner scnr = new Scanner(System.in);
		//read user input
		
		System.out.println("Welcome. Please enter a four-digit integer: ");
		//prompt for user input
		
		
		if (number < 9999 || number > 1000) 
		{
			
			number = scnr.nextInt();
		}
		//check if the input is four digits
		
		else 
		{
			System.out.println("Invalid. Please enter a four-digit integer: ");
			number = scnr.nextInt();
		}
		//if the input is not four digits, force the user to input a four digit integer.
	
		digit1 = number / 1000;
	    digit2 = number / 100 % 10;
	    digit3 = number / 10 % 10;
	    digit4 = number % 10;
	        
		digit1 = (digit1 + 7) % 10;
        digit2 = (digit2 + 7) % 10;
        digit3 = (digit3 + 7) % 10;
        digit4 = (digit4 + 7) % 10;
        //take the digits entered and add 7, then get the remainder after dividing by 10
        
        temp = digit1;
        digit1 = digit3;
        digit3 = temp;
        //take the values of digit 1 and swap it with digit 3 by storing it to a temporary value and then transferring it
 
        temp = digit2;
        digit2 = digit4;
        digit4 = temp;
        //take the values of digit 2 and swap it with digit 4 by storing it to a temporary value and then transferring it
        
        System.out.printf("The encrypted number is %d%d%d%d\n", digit1, digit2, digit3, digit4);
        //print the encrypted number
        
	}

}
