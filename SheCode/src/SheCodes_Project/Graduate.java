package SheCodes_Project;

import java.net.URL;
import java.util.*;


public class Graduate {
	//properties
    String firstName;
    String lastName;
    String password;
    boolean isNeedToChangePass;
	List<String> courses;
	URL Linkedin;
	JobSearchingStatus jobSearchingStatus;
	
public Graduate(){
	//String user = createUserName(firstName, lastName);
	char[] otpPass;
	
	
	otpPass = otpBuild();
	System.out.println("Your OTP is: " + otpPass);
	
	
	
}
	


static public String createUserName(String firstName, String lastName){
	 String userName = firstName + "." + lastName + ".she-codes";
	 System.out.println("Your user name is:" + userName);
	 return userName;
}

static char[] otpBuild (){
	

    // Using numeric values
    String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String Small_chars = "abcdefghijklmnopqrstuvwxyz";
    String numbers = "0123456789";
            


    String values = Capital_chars + Small_chars +
                    numbers;

    // Using random method
    Random rndm_method = new Random();

    char[] otp = new char[8];

    char[] password = new char[8];
    
    for (int i = 0; i < 8; i++)
    {
        // Use of charAt() method : to get character value
        // Use of nextInt() as it is scanning the value as int
        password[i] =
          values.charAt(rndm_method.nextInt(values.length()));

    }
    return password;
}


	enum JobSearchingStatus {
		NOTLOOKING,
		OPEN,
		SEARCHING	
	}
}
