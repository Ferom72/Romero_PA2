import java.util.Scanner;

public class Application {
	
	
	public static void main(String[] args) {
		Decrypter callDecrypter = new Decrypter();//Calls the Decrypter to Decrypt the numbers.
		callDecrypter.decrypter();
		Encrypter callEncrypter = new Encrypter();//Calls the Encrypter to Encrypt the numbers. 
		callEncrypter.encrypt();
        
		
	}	
}
	
