package Lab3;

// At the top of every program this semester you MUST place the following:

// TURN IN:  Email me both the java and class files, i.e. G00123_Lab3.java and G00123_Lab3.class

/**
* @Author: Robert Lu
* @Email: robertlu99@yahoo.com
* @Course: CIS 254
* @Class: G00926921_Lab3
* @Purpose: This class uses the creation of multiple instances of the Bicycle class for each different owner.
* @Usage: Run the class file in the debug console.
* @Lab Number: 3
* @Date: 6/26/2012
*/

public class G00926921_Lab3
{

	    public static void main( String[] args ) {
	    	
	    	Bicycle bicycle = new Bicycle();
	    	Bicycle bike = new Bicycle();
	    	
	    	String bicycleName = "Kenny McCormick";
	    	String bikeName = "Robert Lu";
	    	
	    	int bicycleLicense = 12345;
	    	int bikeLicense = 926921;
	    	
	    	bicycle.setOwnerName(bicycleName);
	    	bike.setOwnerName(bikeName);
	    	
	    	bicycle.setLicenseNumber(bicycleLicense);
	    	bike.setLicenseNumber(bikeLicense);
	    	
	    	System.out.printf("Owner: %s\nLicense Number: %s\n", bicycle.getOwnerName(), bicycle.getLicenseNumber());
	    	System.out.printf("Owner: %s\nLicense Number: %s", bike.getOwnerName(), bike.getLicenseNumber());
	    	        
	    }

}