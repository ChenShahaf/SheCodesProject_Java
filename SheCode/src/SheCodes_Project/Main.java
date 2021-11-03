package SheCodes_Project;

import java.util.*;

/**
 * @author chen
 *
 */
public class Main {//begining of class

     static ArrayList<Graduate> graduates = new ArrayList<Graduate>();


	public static void main(String[] args) {
		
		ArrayList<String> requirements = new ArrayList<String>();
		requirements.add("Basic Python");
		requirements.add("Git");
		boolean i_shouldOfferJob = false;
		
		Graduate alumni1 = registerNewGrad("Chen","Shahaf");
		graduates.add(alumni1);
		Graduate alumni2 = registerNewGrad("Inbal","Schkolnik");
		graduates.add(alumni2);
		
		
		
		
		Graduate chen = sheCodesLogin(alumni1.userName, alumni1.password);
		if(chen != null) {
			if(chen.isNeedToChangePass) {
				chen.updatePassword();
			}
		}
		
	
		
		
		Graduate inbal = sheCodesLogin(alumni2.userName, alumni2.password);
		if(inbal != null) {
			if(inbal.isNeedToChangePass) {
				inbal.updatePassword();
			}
		}
		
		
		updatingLoop(chen);
		updatingLoop(inbal);
		
		
		
		
		i_shouldOfferJob = chen.shouldOfferJob(requirements);
		System.out.println(i_shouldOfferJob);
		i_shouldOfferJob = inbal.shouldOfferJob(requirements);
		//System.out.println(i_shouldOfferJob);
	

	}//end of main 

	public static Graduate registerNewGrad(String firstname, String lastname) {
		return new Graduate(firstname,lastname);
		
	}
	
	
	public static Graduate sheCodesLogin(String username, String password) {
		for(int i=0; i < graduates.size(); i++) {
			if(graduates.get(i).userName == username){
				if(graduates.get(i).password == password) {
					return graduates.get(i);
				}
			}
		}
		return null;
	}
	public static void updatingLoop(Graduate graduate) {
		int option;
		char i_continue;
		boolean continueloop = true;
		Scanner scan = new Scanner(System.in);
		
		while(continueloop) {
			System.out.println("Hello " + graduate.userName);
			System.out.println("What would you like to do:");
			System.out.println("1. update Password");
			System.out.println("2. update resume");
			System.out.println("3. update linkdenIn page");
			System.out.println("4. update job search status");
			option = scan.nextInt();
			switch(option) {
				case 1:
					graduate.updatePassword();
					break;
				case 2:
					graduate.updateResume();
					graduate.updateJobSreachStatus();
					break;
				case 3:
					graduate.updateLinkedin();
					break;
				case 4:
					graduate.updateJobSreachStatus();
					break;
				default:
					System.out.println("Nothing from 1-4 chosen");
					continueloop = false;
					break;
			}
				
			System.out.println("Would you like to update something else type Y/N?");
			 i_continue = scan.next().charAt(0);
			if(i_continue == 'Y' || i_continue == 'y') {
				continueloop = true;
			}
			else if(i_continue == 'N' || i_continue == 'n') {
				continueloop = false;
				
			}
			else {
				System.out.println("invalid input");
				continueloop = false;
			}
		}
	}
	

}//end of class
