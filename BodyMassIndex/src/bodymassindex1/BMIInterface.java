package bodymassindex1;

 public interface BMIInterface {
	public  double convertCmToMetersSquared(double heightCm);
	public  double calculateBMI(double heightMetersSquared, double weightKg);
	void printBMIReading(double bmi);
	
}

