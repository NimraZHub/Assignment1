public class Prob10{
	public static void main(String [] args){
		double totalSellingPrice=18000;
        double profitPercentage=20.0;

        // Calculate the total cost price
        double totalCostPrice=totalSellingPrice/(1 + profitPercentage / 100);

        // Calculate the cost price of one item
        double costPricePerItem=totalCostPrice/15;

        System.out.println("Total cost price of 15 items: " + totalCostPrice);
        System.out.println("Cost price of one item: " + costPricePerItem);
	}
}