package SheCodes_Project;
import java.util.*;
import java.net.URL;

public class LinkedIn {
	static String linkedin;
	
	
public LinkedIn() {
	
	
	}//end of constructor

public static boolean validLink(String url) {//start validLink
	/* Try creating a valid URL */
    try {
        new URL(url).toURI();
        return true;
    }
      
    // If there was an Exception
    // while creating URL object
    catch (Exception e) {
        return false;
    }
	
}//end Validlink
public static String addLinkedin() {
	Scanner scan = new Scanner(System.in);
	 char answer;
	 System.out.println("do you wish to add a linkedIn page link? Y/N");
	 answer = scan.next().charAt(0);
	 if(answer == 'Y') {
		 System.out.println("Please add the link of the LinkedIn page:");
		  linkedin = scan.next();
	 }else{
		 if(answer == 'N' || answer =='n') {
			 linkedin = "Null";
		 }
	 }
	return linkedin;
	}
}
