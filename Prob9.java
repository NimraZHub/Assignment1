public class Prob9{
	public static void main(String [] args){
		int amountInHundreds=7;
		int amount=amountInHundreds*100;
		
		// Calculate the number of 100 notes
		int totalNumOfHundredNotes=amount/100;
        amount%=100;
		
		// Calculate the number of 50 notes
        int totalNumOfFiftyNotes=amount/50;
        amount%=50; 
		
		// Calculate the number of 10 notes
        int totalNumOfTenNotes=amount/10;
		
		System.out.println("Number of 100 notes: " + totalNumOfHundredNotes);
        System.out.println("Number of 50 notes: " + totalNumOfFiftyNotes);
        System.out.println("Number of 10 notes: " + totalNumOfTenNotes);
		
	}
}