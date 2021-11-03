package SheCodes_Project;

import java.util.*;





public class Graduate {
	// properties
	String userName;
	static String password;
	boolean isNeedToChangePass = true;
	ArrayList<String> courses = new ArrayList<String>();

	JobSearchingStatus jobSearchingStatus;
	String urlLink;

	public Graduate(String i_firstName, String i_lastName) {


		//creating user
		userName = createUserName(i_firstName, i_lastName);
		//creating OTP Password
		password = otpBuilder();
		System.out.println("Your OTP is: " + password);


	}

	private String createUserName(String firstName, String lastName) {
		String userName = firstName + "." + lastName + ".she-codes";
		System.out.println("Your user name is:" + userName);
		return userName;
	}

	private String otpBuilder() {

		// Using numeric values
		String passOTP = null;

		String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Small_chars = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";

		String values = Capital_chars + Small_chars + numbers;
		// Using random method
		Random rndm_method = new Random();


		char[] passW = new char[8];

		for (int i = 0; i < 8; i++) {
			// Use of charAt() method : to get character value
			// Use of nextInt() as it is scanning the value as int
			passW[i] = values.charAt(rndm_method.nextInt(values.length()));
			passOTP = String.valueOf(passW);


		}

		return passOTP;
	}

	private static boolean isValidPassword(String  i_password ) {

		if ( i_password.length() < 8 ||  i_password.length() > 8)
		{
			System.out.println("Your password must be 8 characters long");
			return false;
		}
		String upperCaseChars = "(.*[A-Z].*)";
		if (! i_password.matches(upperCaseChars ))
		{
			System.out.println("Your password must contain atleast one capital letter, olower case letter and one number");
			return false;
		}
		String lowerCaseChars = "(.*[a-z].*)";
		if (! i_password.matches(lowerCaseChars ))
		{
			System.out.println("Your password must contain atleast one capital letter, olower case letter and one number");
			return false;
		}
		String numbers = "(.*[0-9].*)";
		if (! i_password.matches(numbers ))
		{
			System.out.println("Your password must contain atleast one capital letter, olower case letter and one number");
			return false;
		}

		else {
			return true;
		}

	}


	public void updatePassword() {
		String  updatedPass = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("please type in your updated password it should contain 8 charcters small letters, caps and numbers");
		updatedPass = scan.next();
		while(!isValidPassword(updatedPass)) {
			System.out.println("Your password must contain atleast one capital letter, olower case letter and one number");
			System.out.println("please select a valid password");
			updatedPass = scan.next();
		}
		if(isValidPassword(updatedPass)) {
			password = updatedPass;
		}
	}
	enum JobSearchingStatus {
		NOTLOOKING, OPEN, SEARCHING
	}

	public void updateResume() {
		System.out.println("which of the following courses would you like to add to your resume by alphabetical order?");
		System.out.println("\"Android\",\"Basic Python\",\"Data analysis\",\"Git\",\"Java basics\",\n"
				+ "\"Landing a job \",\"Git\",\"Python for programmers\",\"React\"");
		Scanner scan =new Scanner(System.in);
		boolean addCourses = true;
		while(addCourses) {
			System.out.println("enter a course you wish to add:");
			String course =scan.nextLine();
			System.out.println(course);
			if(!courses.contains(course)){
				courses.add(course);
			}
			System.out.println("would you like to add another course: 'Y' or 'N'");
			char i_addCourses = scan.next().charAt(0);


			if(i_addCourses == 'Y' || i_addCourses == 'y') {
				addCourses = true;
			}




			else if(i_addCourses == 'N' || i_addCourses == 'n') {
				addCourses = false;

			}
			else {
				System.out.println("invalid input");
				break;
			}
		}
	}

	public void updateLinkedin() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please add the link of the LinkedIn page:");
		urlLink = scan.next();

	}

	public void updateJobSreachStatus(){
		Scanner scan = new Scanner(System.in);
		int jobSearch;
		System.out.println("Please choose one of the three options:");
		System.out.println("1.NOTLOOKING 2.OPEN 3.SEARCHING");
		jobSearch = scan.nextInt();
		switch(jobSearch){
		case 1:
			System.out.println("you have chosen Not looking");
			jobSearchingStatus = JobSearchingStatus.NOTLOOKING;
			break;

		case 2:
			System.out.println("you have chosen open");
			jobSearchingStatus = JobSearchingStatus.OPEN;
			break;

		case 3:
			System.out.println("you have chosen Searching");
			jobSearchingStatus = JobSearchingStatus.SEARCHING;
			break;

		default:
			System.out.println("You have chosen an unvalid answer the default is not looking");
			jobSearchingStatus = JobSearchingStatus.NOTLOOKING;
			break;

		}

	}


	public boolean shouldOfferJob(ArrayList<String> requirements){
		//System.out.println(courses.toString());
		if (jobSearchingStatus == JobSearchingStatus.NOTLOOKING)
			return false;
		if(courses.size() < requirements.size()) {
			return false;
		}

		for(int j=0; j < requirements.size(); j++) {
			if (!courses.contains(requirements.get(j))) 
				return false;
		}
		return true;
	}



}//end of class




