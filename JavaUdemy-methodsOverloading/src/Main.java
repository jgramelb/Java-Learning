
public class Main {
	
	public static void main(String[] args) {		
		/*Challenge:
		 *Create a method called calcFeetAndInchesToCentimeters 
		 *	Two parameters: (1) feet (2) inches
		 * 	Validate that the 1st parameter ft is >= 0
		 * 	Validate that the 2nd parameter in is >= 0 and <= 12
		 * 	Return -1 from method if either of the above is not true
		 * 		If the parameters are valid, then calculate how many centimeters comprise the feet & inches passed thru & return that value
		 * 
		 *Create second method called calcFeetAndInchesToCentimeters 
		 *	One parameter: (1) inches
		 *	Validate that inches >= 0
		 *	Return -1 if it is not true
		 *		If the parameter is valid, then calculate how many feet are in the inches
		 */
		
		double feet; double inches;
		feet = 0;
		inches = 0;
		calcFeetAndInchesToCentimeters(feet, inches);
		
		inches = 4;
		calcFeetAndInchesToCentimeters(inches);
		
		inches = 157;
		calcFeetAndInchesToCentimeters(inches);
	}
	//Challenge method: 
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		double centimeters = 0;
		double feetToCent = 0;
		double inchToCent = 0;
		if ((feet < 0) || (inches < 0 ) || (inches > 12)) {
			System.out.println("Invalid feet or inches parameter(s)");
			return -1;
		}
		//Convert feet to centimeters
		feetToCent = feet * 12 * 2.54;
		centimeters = centimeters + feetToCent;

		//Convert inches to centimeters
		inchToCent = inches * 2.54;
		centimeters = centimeters + inchToCent;
		System.out.println(feet + " feet, "+ inches +" inches = " + centimeters + " centimeters");
		return centimeters;		
	}
	//Challenge method:
	public static double calcFeetAndInchesToCentimeters(double inches) {
		double inchToFeet; double remainingInches;
		if (inches < 0) {
			System.out.println("Invalid inches parameter");
			return -1;
		}
		
		//Convert inches to feet
		inchToFeet = (int)inches / 12;
		//Convert remaining inches
		remainingInches = (int)inches %12;
		System.out.println(inches + " inches is equal to " + inchToFeet + " feet and " + remainingInches + " inches");
			
		//Call the overloaded method passing the correct feet and inches
		return calcFeetAndInchesToCentimeters(inchToFeet, remainingInches);
		}
	}
	
