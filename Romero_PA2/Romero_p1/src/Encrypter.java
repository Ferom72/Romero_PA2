import java.util.Scanner;

public class Encrypter {
	
	public void encrypt() {
	
	 Encrypter callEncrypter = new Encrypter();
	 Scanner enterFourDigits = new Scanner(System.in);//This is the scanner for the four digits that they want to encrypt.
	
	 int fourDigit=0;//10-13 are the integers and string to encrypt the numbers
	 int stringSize = 0;
	 
	 String fourDigits;
	    
	    while (stringSize!= 4) {//This "if" statement is saying that if they dont put four numbers try again.
	    	System.out.println("Enter the four numbers that you want encrypte:");
	    	fourDigits = enterFourDigits.nextLine();
	    	stringSize = fourDigits.length();
	    	
		    if (stringSize == 4) {//This makes the string input for the four numbers into an integer.
	            fourDigit= Integer.parseInt(fourDigits);
	            }
	    	}
	 
	 int mathForFirstNumber = fourDigit / 1000;//Lines 25-33 is just math to decode the four numbers.
	 int mathForSecondNumber = (fourDigit % 1000)/ 100;
	 int mathForThirdNumber = (fourDigit % 100)/ 10;
	 int mathForFourthNumber = fourDigit%10;
	 
	 mathForFirstNumber = (mathForFirstNumber+3) % 10;
	 mathForSecondNumber = (mathForSecondNumber+3) % 10;
	 mathForThirdNumber = (mathForThirdNumber+3) % 10;
	 mathForFourthNumber = (mathForFourthNumber+3) % 10;
	 
	 System.out.printf("Your number is now Encrypted:\n");//35 and 36 prints out the encoded number.
	 System.out.printf("%d%d%d%d", mathForThirdNumber,mathForFourthNumber,mathForFirstNumber,mathForSecondNumber);
	 
	} 

}