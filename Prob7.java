public class Prob7{
	public static void main(String [] args){
		int num=12345;
		int digit=0;
		int sum=0;
		while(num>0)
		{
			digit=num%10;
			sum+=digit;
			num/=10;
			i++;
		}
			System.out.print("The sum of five digit number is: " + sum);
		
	}
}