public class Prob2{
	public static void main(String [] args){
		double distanceInKilometers=2614;
		// Conversion factors
        double metersPerKilometer=1000;
        double feetPerMeter=3.28084;
        double inchesPerFoot=12;
        double centimetersPerMeter=100;
		
		// Convert distance to meters, feet, inches, and centimeters
		double distanceInMeters=distanceInKilometers*metersPerKilometer;
		double distanceInFeet=distanceInMeters*feetPerMeter;
		double distanceInInches=distanceInFeet*inchesPerFoot;
		double distanceInCentimeters=distanceInMeters*centimetersPerMeter;
		
		System.out.println("Distance in kilometers: " + distanceInKilometers);
		System.out.println("Distance in meters: " + distanceInMeters);
		System.out.println("Distance in feet: " + distanceInFeet);
		System.out.println("Distance in inches: " + distanceInInches);
		System.out.println("Distance in centimeters: " + distanceInCentimeters);
	}
}