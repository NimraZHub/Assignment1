public class Prob3{
	public static void main(String [] args){
		int sub1=80;
		int sub2=90;
		int sub3=75;
		int sub4=60;
		int sub5=100;
		
		int totalMarks=sub1+sub2+sub3+sub4+sub5;
		int maxMarks=100*5;
		double percentage=((double)totalMarks/maxMarks)*100;
		
		System.out.println("Aggregate: " + totalMarks);
		System.out.println("Percentage: " + percentage + "%");
		
	}
}