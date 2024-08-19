package bodymassindex1;

import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String userName = myScanner.nextLine();
		System.out.println("Patient Name: "+ userName);
		System.out.println("Enter your height");
		double userHeight = myScanner.nextDouble();
		System.out.println("Height: "+ userHeight);
		System.out.println("Enter your weight");
		double userWeight = myScanner.nextDouble();
		System.out.println("Weight: "+ userWeight);
		BMICalculator user = new BMICalculator();
		double userHeightInMetersSquared2 = user.convertCmToMetersSquared(userHeight);
		System.out.println(user.calculateBMI(userHeightInMetersSquared2, userWeight));
		double bmi2 = user.calculateBMI(userHeightInMetersSquared2, userWeight);
		user.printBMIReading(bmi2);
//		if(bmi2 <= 18.5) {
//			System.out.println(userName + " " + "is underweight");
//		}
//		else if(bmi2 >= 18.5 && bmi2 <= 24.9) {
//			System.out.println(userName + " " + "has normal weight");
//		}
//		else if(bmi2 >= 25.0 && bmi2 <= 29.9) {
//			System.out.println(userName + " " + "is overweight");
//		}
//		else if(bmi2 >= 30.0 && bmi2 <= 40.0) {
//			System.out.println(userName + " " + "is obese");
//		}
//		else {
//			System.out.println(userName + " " + "Seek urgent help from your nutritionist");
//		}



				
		
		
	}

}
