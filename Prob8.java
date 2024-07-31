public class Prob8{
	public static void main(String [] args){
		int totalPopulation=80000;
		double percentageOfTotalLiteracy=48.0;
		double percentageOfMen=52.0;
		double percentageOfLiterateMen=35.0;
		
		// Calculate total number of men and women
		double totalMen=(percentageOfMen/100)*totalPopulation;
		double totalWomen=totalPopulation-totalMen;
		
		// Calculate number of literate people and men
		double totalLiteratePeople=(percentageOfTotalLiteracy/100)*totalPopulation;
		double totalLiterateMen=(percentageOfLiterateMen/100)*totalPopulation;
		
		// Calculate illiterate men and women
		double totalIlliterateMen=totalMen-totalLiterateMen;
		double totalIlliteratePeople=totalPopulation-totalLiteratePeople;
		double totalIlliterateWomen=totalIlliteratePeople-totalIlliterateMen;
		
		System.out.println("The number of illiterate men is: " + totalIlliterateMen);
		System.out.println("The number of illiterate women is: " + totalIlliterateWomen);
		
		
	}
}