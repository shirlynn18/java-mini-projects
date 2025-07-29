import javax.swing.JOptionPane;

public class CarRental {

	public static void main(String[] args) {

		// Initialize variables
		double discount = 0, totalRental = 0, base = 0;
		
		String carType, duration;

		// Loop until valid car type is selected
		do {
			// Prompt user to input for car type
			carType = JOptionPane.showInputDialog(null, 
					  "Select one type of car.\n" 
					  + "1. Compact\n" 
					  + "2. Sedan\n" 
					  + "3. SUV\n" 
					  + "Please enter a number between 1 and 3: ");
			
			// Determine the base rental based on the selected car type
			switch (carType) {
				case "1":
					base = 30.50;
					break;
	
				case "2":
					base = 50;
					break;
	
				case "3":
					base = 80.96;
					break;
	
				default:
					// Display an error message for invalid car type
					JOptionPane.showMessageDialog(null, 
						"Invalid car type. Please try again.");

			}
		} while (!carType.equals("1") && !carType.equals("2") && !carType.equals("3") );
	
		// Loop until valid rental duration is selected
		do {
		
			// Prompt user to input for rental duration
			duration = JOptionPane.showInputDialog(null, 
						"Select a rental duration.\n" 
						+ "1. Daily\n"
						+ "2. Weekly\n" 
						+ "3. Monthly\n" 
						+ "Please enter a number between 1 and 3: ");
	
			// Determine the discount and total rental cost based on the selected rental duration
			switch (duration) {
				case "1":
					discount = 0;
					totalRental = base;
					break;
		
				case "2":
					discount = 15;
					totalRental = base * 7 * 0.85;
					break;
		
				case "3":
					discount = 30;
					totalRental = base * 30 * 0.7;
					break;
		
				default:
					// Display an error message for invalid rental duration
					JOptionPane.showMessageDialog(null, 
						"Invalid rental duration. Please try again.");
				}
			
		}while(!duration.equals("1") && !duration.equals("2") && !duration.equals("3") );

		// Display the final rental cost message
		if (discount == 0) {
			
			// No discount applied
			JOptionPane.showMessageDialog(null, 
					"No discount is applied.\n" 
					+ "The final rental cost: $" 
					+ String.format("%.2f", totalRental));
		}

		else {
			// Discount applied. 
			JOptionPane.showMessageDialog(null, 
					String.format("%.2f", discount) 
					+ "% discount applied.\n"
					+ "The final rental cost: $" 
					+ String.format("%.2f", totalRental));
		}

	}
}
