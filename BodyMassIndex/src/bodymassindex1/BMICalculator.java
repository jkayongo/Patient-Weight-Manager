package bodymassindex1;

public class BMICalculator implements BMIInterface{
	public double convertCmToMetersSquared(double heightCm) {
		double userHeightInMeters = heightCm * 0.01;
		double userHeightInMeterSquared = userHeightInMeters * userHeightInMeters;
		return userHeightInMeterSquared;
	}
	public  double calculateBMI(double heightMetersSquared, double weightKg) {
		double userbmi = weightKg/heightMetersSquared;
		return userbmi;
	}
	public void printBMIReading(double bmi) {
		System.out.println("The BMI reading is"+ " "+ bmi);
	}
	public static void main(String[] args) {
		

	}

}
