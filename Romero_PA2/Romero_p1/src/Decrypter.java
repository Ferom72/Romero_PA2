import java.util.Scanner;

public class Decrypter {
	
	public void decrypter(){
		
	    Scanner enterFourDigits = new Scanner(System.in);//The scanner for the four digit number
		
		
	    int fourDigit=0;//Lines 10-15 integers to do the math for the decryption.
	    int stringSize = 0;
		int mathToFindFirstNumber;
	    int mathToFindSecondNumber;
	    int mathToFindThirdNumber;
	    int mathToFindFourthNumber;
	    
	    String fourDigits;
	    
	    while (stringSize!= 4) {//This "if" statement is saying that if they dont put four numbers try again.
	    	System.out.println("Enter the four numbers that you want decrypted:");
	    	fourDigits = enterFourDigits.nextLine();
	    	stringSize = fourDigits.length();
	    	
		    if (stringSize == 4) {//This makes the string input for the four numbers into an integer.
	            fourDigit= Integer.parseInt(fourDigits);
	            }
	    	}
	     
	 mathToFindFirstNumber = fourDigit/1000;//Lines 29-37 is just math to decode the four numbers.
	 mathToFindSecondNumber = fourDigit/100%10;
	 mathToFindThirdNumber = fourDigit/10%10;
	 mathToFindFourthNumber = fourDigit%10;
     
	 mathToFindFirstNumber = (mathToFindFirstNumber+7)%10;
     mathToFindSecondNumber = (mathToFindSecondNumber+7)%10;
     mathToFindThirdNumber = (mathToFindThirdNumber+7)%10;
     mathToFindFourthNumber = (mathToFindFourthNumber+7)%10;
     
     System.out.print("Your number is:\n");//39 and 40 prints out the decoded number.
     System.out.printf("%d%d%d%d\n",mathToFindThirdNumber,mathToFindFourthNumber,mathToFindFirstNumber,mathToFindSecondNumber);
	}
	
	


	
	
	
	
	
	
	


}