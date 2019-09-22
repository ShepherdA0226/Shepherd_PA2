package shepherd_p3;
import java.util.Scanner;
public class PollProgram {

	public static void main(String[] args) {
		
		
		Scanner scnr = new Scanner(System.in);
		String topics[] = new String[5];
		int responses[][] = new int[5][10];
		char ans1;
		
		System.out.println("Would you like to take a quick 5 question survey? Enter y / n : ");
		ans1 = scnr.next().charAt(0);
		
		if (ans1 == 'y')
		{
			System.out.println("On a scale of 1 to 10, how much do you like pizza?");
			topics[0] = scnr.next();
			
			System.out.println("On a scale of 1 to 10, how important do you believe climate change is?");
			topics[1] = scnr.next();
			
			System.out.println("On a scale of 1 to 10, how much do you support our current president (Donald Trump)?");
			topics[2] = scnr.next();
			
			System.out.println("On a scale of 1 to 10, how much do you enjoy playing video games?");
			topics[3] = scnr.next();
			
			System.out.println("On a scale of 1 to 10, how much do you enjoy your current job?");
			topics[4] = scnr.next();
		}
		
		else if (ans1 == 'n')
			
		{
			System.exit(0);
		}
			
		System.out.println("Pizza" + " " + topics[0]);
		System.out.println("Climate Change" + " " + topics[1]);
		System.out.println("Politics" + " " + topics[2]);
		System.out.println("Video Games" + " " + topics[3]);
		System.out.println("Work" + " " + topics[4]);
		
	}

}
