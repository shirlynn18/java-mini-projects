import javax.swing.JOptionPane;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		
		// Prompt user to choose an operation
		int choice = Integer.parseInt(JOptionPane.showInputDialog(
					"Calculator Menu: \n"
					+ "1. Addition\n" 
					+ "2. Substraction\n"
					+ "3. Multiplication\n"
					+ "4. Division\n"
					+ "5. Remainder\n"
					+ "6. Exit\n"
					+ "Please enter a number between 1 and 6:  "));
		
		// Check if user chose to exit
		if (choice == 6) {
			JOptionPane.showMessageDialog(null, 
					"Exiting the calculator...");
			System.exit(0);
		}
		
		// Check for invalid input
		else if (choice < 1 || choice > 6) {
			JOptionPane.showMessageDialog(null, 
					"Invalid number. Please try again.");
			System.exit(0);
		}
		
		// Prompt user to input two numbers
		double num1 = Double.parseDouble(JOptionPane.showInputDialog(
				"Please enter first number: "));
		
		double num2 = Double.parseDouble(JOptionPane.showInputDialog(
				"Please enter second number: "));
		
		double totalNumber = 0;
		
		// Perform the selected operation
		switch(choice) {
		
			case 4:
				if(num2 != 0){
					totalNumber = num1 / num2;
				}
				else {
					JOptionPane.showMessageDialog(null, 
							"Error: Cannot divide by zero. Please try again.");
					System.exit(0);
				}
				break;
				
			case 1:
				totalNumber = num1 + num2;
				break;
			
			case 2:
				totalNumber = num1 - num2;
				break;
			
			case 3:
				totalNumber = num1 * num2;
				break;
				
			case 5:
				if(num2 != 0) {
					totalNumber = num1 % num2;
				}
				else {
					JOptionPane.showMessageDialog(null, 
							"Error: Cannot find remainder for division by zero. Please try again.");
					System.exit(0);
				}
				break;
		
		}
		
		// Display the result of the operation
		JOptionPane.showMessageDialog(null,
				"The answer is " + totalNumber + ".");

	}

}
