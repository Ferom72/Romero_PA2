import java.util.Scanner;

public class BMICalculator {
	
	public static void main(String[] args) {
		Scanner BMI = new Scanner(System.in); //This is the scanner to get which BMI formula they want.
		Scanner Height = new Scanner(System.in);//This is the scanner to get their height.
		Scanner Weight = new Scanner(System.in);//This is the scanner to get their weight 
		

		
		System.out.print("BMI Categories:\n"//Lines 12-23 are just printing the BMI categories and asking what formula they would like.
				         + "Underweight= <18.5\n"
				         + "Normal weight = 18.5-24.9\n"
				         + "Overweight = 25-29.9\n"
				         + "Obesity = BMI of 30 or greater\n\n");
		
		System.out.print("Before we start which formula would you like to use:\n\n"
				         + "BMI= 703 * WeightInPounds/ HeightInInches^2\n"
				         + "or\n"
				         + "BMI= WeightInKilograms/HeightInMeters^2\n\n"
				         + "Type BMI1 if you want the first one and BMI2 if you want the second one:\n");
		String whichBMI = BMI.next();
		
		if(whichBMI.equals("BMI1")) {//This is to calculate the BMI of the first formula.It also prints the results.
			
	        System.out.print("Enter Height(inches):\n");
			double personsHeight = Height.nextInt();
			
			
			System.out.print("Enter Weight(pounds):\n");
			double personsWeight = Weight.nextInt();
			
			System.out.printf("Your BMI based on what you put is: %.02f\n\n",(703 * personsWeight)/(personsHeight*personsHeight));
			
			System.out.printf("Finally you're BMI = %.02f\t you're Height = %f\t you're Weight = %f",(703 * personsWeight)/(personsHeight*personsHeight),personsHeight,personsWeight);
			
			
			
		}
//----------------------------------//-------------------------------------------//--------------------------------		
		
		if(whichBMI.equals("BMI2")) {// This is to calculate the BMI of the second formula.It also prints the results.
			
	        System.out.print("Enter Height(meters):\n");
		    double personsHeight = Height.nextInt();
			
			
			
			System.out.print("Enter Weight(kilograms):\n");
			double personsWeight = Weight.nextInt();
			
			System.out.printf("Your BMI based on what you put is: %.02f\n\n",(personsWeight)/(personsHeight*personsHeight));
			
			System.out.printf("Finally you're BMI = %.02f\t you're Height = %.02f\t you're Weight = %.02f",(personsWeight)/(personsHeight*personsHeight),personsHeight,personsWeight);
		}
		
	
		
		


		
		
		
		
		
		
	}	
}