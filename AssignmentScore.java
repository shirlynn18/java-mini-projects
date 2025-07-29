import java.util.Scanner;

public class AssignmentScore {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		double attendedClass = 0, totalClass, score1, score2, score3, totalScore;
			
			// Prompt user to input the number of classes attended
			System.out.println("Please enter number of classes attended: ");
			attendedClass = input.nextDouble();
			
			// Check if the number of classes attended is valid
			if (attendedClass < 0) {
				System.out.println("Invalid number of classes. "
							+ "Please try again.");
				System.exit(0);
			}
				
			// Prompt user to input the total number of classes
			System.out.println("Please enter total number of classes: ");
			totalClass = input.nextDouble();
			
			// Check if the total number of classes is valid
			if (totalClass <= 0 || attendedClass > totalClass) {
				System.out.println("Invalid total number of classes."
							+ "Please try again.");
				System.exit(0);
			}
			
			// Prompt user to input the score for assignment 1
			System.out.println("Please enter score for assignment 1: ");
			score1 = input.nextDouble();
			
			// Check if the score for assignment 1 is valid
			if (score1 < 0) {
				System.out.println("Invalid score for assignment 1. "
							+ "Please try again.");
				System.exit(0);
			}
			
			// Prompt user to input the score for assignment 2
			System.out.println("Please enter score for assignment 2: ");
			score2 = input.nextDouble();
			
			// Check if the score for assignment 2 is valid
			if (score2 < 0) {
				System.out.println("Invalid score for assignment 2. "
							+ "Please try again.");
				System.exit(0);
			}
			
			// Prompt user to input the score for assignment 3
			System.out.println("Please enter score for assignment 3: ");
			score3 = input.nextDouble();
			
			// Check if the score for assignment 3 is valid
			if (score3 < 0) {
				System.out.println("Invalid score for assignment 3. "
							+ "Please try again.");
				System.exit(0);
			}
			
			// Prompt user to input the total score of all assignments
			System.out.println("Please enter total score of all assignments: ");
			totalScore = input.nextDouble();
			
			// Check if the total score of all assignments is valid
			if (totalScore < (score1 + score2 + score3)) {
				System.out.println("Invalid total assignment score. "
							+ "Please try again.");
				System.exit(0);
			}
			
		// Calculation of attendance percentage
		double attendance = attendedClass / totalClass * 100;
		
		// Calculation of final score percentage
		double finalScore = ((score1 + score2 + score3) / totalScore) * 100;
			
		// Check if the student is allowed to sit for the exam
		if (attendance >= 75 && finalScore >= 50) {
			System.out.println("Your attendance is " 
				+ String.format("%.2f", attendance) 
				+ "% and your final assignment score is " 
				+ String.format("%.2f", finalScore) 
				+ "%.\n" 
				+ "You are ALLOWED to sit for exam.");
		}
		
		else {
			System.out.println("Your attendance is " 
				+ String.format("%.2f", attendance) 
				+ "% and your final assignment score is " 
				+ String.format("%.2f", finalScore) 
				+ "%.\n" 
				+ "You are NOT ALLOWED to sit for exam.");
		}
		
	input.close();
		
	}

}
