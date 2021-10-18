package SheCodes_Project;

//import random

import java.util.*;

public class OTP {
	
	int len;
	
	
	
	public OTP(int len) {
		
		this.len = len;
		 
		    
		    
	}

     static char[] otpBuild (int len){
		
	    System.out.print("You OTP is : ");

	    // Using numeric values
	    String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
                
  
  
        String values = Capital_chars + Small_chars +
                        numbers;

	    // Using random method
	    Random rndm_method = new Random();

	    char[] otp = new char[len];

	    char[] password = new char[len];
	    
        for (int i = 0; i < len; i++)
        {
            // Use of charAt() method : to get character value
            // Use of nextInt() as it is scanning the value as int
            password[i] =
              values.charAt(rndm_method.nextInt(values.length()));
  
        }
        return password;
    }
    
     public static String changePassword() {
    	 
    	 Scanner scan =new Scanner(System.in);
    	 System.out.println("please enter new paswword:");
    	 
         String newPassword = scan.next();
    		
    	 return newPassword; 
     }
     public static boolean isValidPassword(String password) {
    	 
    	 boolean isValid = true;
         if (password.length() < 8 || password.length() > 8)
         {
                 System.out.println("Password must be 8 length characters");
                 isValid = false;
         }
         String upperCaseChars = "(.*[A-Z].*)";
         if (!password.matches(upperCaseChars ))
         {
                 System.out.println("Password must have atleast one uppercase character");
                 isValid = false;
         }
         String lowerCaseChars = "(.*[a-z].*)";
         if (!password.matches(lowerCaseChars ))
         {
                 System.out.println("Password must have atleast one lowercase character");
                 isValid = false;
         }
         String numbers = "(.*[0-9].*)";
         if (!password.matches(numbers ))
         {
                 System.out.println("Password must have atleast one number");
                 isValid = false;
         }
         
         if(isValid == true) {
        	 System.out.println("Your password is good and strong");
         }
         if(isValid == false) {
        	 System.out.println("your password is too weak, please select a different password");        	 
         }
        
         return isValid; 
     }
    	 
    
	
	
	







}





