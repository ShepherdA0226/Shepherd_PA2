package shepherd_p1;
import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		
        int digit1;
        int digit2;
        int digit3;
        int digit4;
        int number = 0;
        int temp;
        //initializing variables
        
        Scanner scnr = new Scanner(System.in);
        //read user input
 
        if (number < 9999 || number > 1000)
        {
        System.out.print(" Enter Number: ");
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
        //reversing the encryption
        
        if(digit1 <= 6 && digit1 >= 0)
            digit1 = digit1 + 10;
        if(digit2 <= 6 && digit2 >= 0)
            digit2 = digit2 + 10;
        if(digit3 <= 6 && digit3 >= 0)
            digit3 = digit3 + 10;
        if(digit4 <= 6 && digit4 >= 0)
            digit4 = digit4 + 10;
        //reversing the encryption
        
        digit1 = digit1 - 7;
        digit2 = digit2 - 7;
        digit3 = digit3 - 7;
        digit4 = digit4 - 7;
        //reversing the encryption
        
        temp = digit1;
        digit1 = digit3 * 1000;
        digit3 = temp * 10;
        //reversing the encryption
        
        temp = digit2;
        digit2 = digit4 * 100;
        digit4 = temp;
        //reversing the encryption
        
        System.out.printf("The decrypted number is %d\n", digit1 + digit2 + digit3 + digit4);
        //print the decrypted number
	}

}
