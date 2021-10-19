package SheCodes_Project;

import java.util.*;

public class Main {

    


	public static void main(String[] args) {
		Graduate alumni1 = new Graduate();
		
		
		/*alumniID alumni1 = new alumniID();
		String newPass;
		alumniID.isValidID(alumni1.firstName);
		alumniID.isValidID(alumni1.lastName);
		OTP otp = new OTP(8);
		char[] firstPass = OTP.otpBuild(otp.len);
		System.out.println(firstPass);
		
		
		
		//creating new password
		newPass = OTP.changePassword();
		System.out.println(OTP.isValidPassword(newPass));
		
		String [] resume = new String[1];
		resume = updateResume(resume);
		
		
		LinkedIn linkIn = new LinkedIn();
		LinkedIn.validLink(linkIn.linkedin);
		int jobSearch = jobSearchStatus();
		
		//calling registergrad to create user name
		String userName = registerNewGradUserName(alumni1.firstName,alumni1.lastName);
		
		
		//creating update variable for update
		int update = registerNewGradUpdae();
		*/
		 
		
		

		
	        

	}
static public int jobSearchStatus() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("welcome student which job search status are you now?");
		System.out.println("1. not looking for a change");
		System.out.println("2. not looking but open for suggestions");
		System.out.println("3. looking for a new challenge");
		int decision = scan.nextInt();
		return decision;
	}
	static public String[] updateResume(String[] courses) {
		
		 System.out.println("which of the following courses would you like to add to your resume?");
		 System.out.println("\"Web\",\"Java basics\",\"Basic Python\",\"Android\",\"Python for programmers\",\n"
		 		+ "\"Data analysis \",\"Git\",\"Landing a job\",\"React\"");
		 Scanner scan =new Scanner(System.in);
		 System.out.println("enter the number of courses you learned and wish to added");
		 int n=scan.nextInt();
		 courses =new String[n];
		 for(int i=0;i<n;i++){
		        System.out.println("enter the "+(i+1)+" course you wish to add with no spaces:");
		        courses[i]=scan.next();
		    }
		    System.out.println("courses Entered by user:");

		    for(String s:courses){
		        System.out.println(s);
		    }
		    
		    return courses;
		
	}

	public static String registerNewGradUserName(String firstName, String lastName){
		 String user = firstName + "." + lastName + ".she-codes";
		 System.out.println("Your user name is:" + user);
		 return user;
		 
	 }
	public static int registerNewGradUpdae() {
		String newPassword = null;
		System.out.println("which of the following would you like to do:");
		System.out.println("1. update password");
		System.out.println("2. update resume");
		System.out.println("3. update job search status");
		System.out.println("4. update your linkedin page?");
		System.out.println("5. i wish to update nothing");
		Scanner scan = new Scanner(System.in);
		int update = scan.nextInt();
		 return update;
	}
	
	
	
	 

}
