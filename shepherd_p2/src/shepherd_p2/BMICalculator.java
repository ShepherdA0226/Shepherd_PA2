package shepherd_p2;
import java.util.Scanner;
import java.lang.Math;
public class BMICalculator {

	public static void main(String[] args) {
		
		int weight;
		int height;
		double BMI;
		
		Scanner scnr = new Scanner(System.in);
		
		
		System.out.println("Enter your weight (in pounds): ");
		weight = scnr.nextInt();
		
		System.out.println("Enter your height (in inches): ");
		height = scnr.nextInt();
		System.out.println("");
		BMI = ( (weight) * 703) / (Math.pow(height,2) ) ;
		BMI = (Math.round(BMI));
		
		System.out.println("Your BMI is: " + BMI);
		System.out.println("");
		
		System.out.println("BMI Categories:");
		System.out.println("Underweight = < 18.5");
		System.out.println("Normal weight = 18.5–24.9");
		System.out.println("Overweight = 25–29.9");
		System.out.println("Obesity = BMI of 30 or greater");
	}

}
