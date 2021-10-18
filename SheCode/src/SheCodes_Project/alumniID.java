package SheCodes_Project;
//importing until library for scanner
import java.util.*;

public class alumniID {
	//properties
	static String firstName;
	static String lastName;

	
	


	public alumniID() {
		super();
		System.out.println("Please type your first name: ");
		Scanner scan =new Scanner(System.in);
        this.firstName =scan.next();
		
		System.out.println("Please enter your last namee as one word");
		
		this.lastName=scan.next();
		System.out.println("your user name is: " + this.firstName + "." + this.lastName +"."+ "she-codes");
		
		
	}

	public static boolean isValidID(String username){
		boolean isValid = true;
		String numbers = "(.*[0-9].*)";
        if (username.matches(numbers ))
        {
                System.out.println("user name must not include numbers");
                isValid = false;
        }
        String specialChars = "(.*[@,#,$,%].*$)";
        if (username.matches(specialChars ))
        {
                System.out.println("user name must not include special characters");
                isValid = false;
        }
        if(isValid == true) {
       	 System.out.println("Your user name is valid");
        }
        if(isValid == false) {
       	 System.out.println("your user name is not valid");        	 
        }
       
        return isValid;
        
        
		
		
	}



	@Override
	public String toString() {
		return "alumniID [firstName=" + firstName + ", lastName=" + lastName + "]";
	}


	

	
	

}
