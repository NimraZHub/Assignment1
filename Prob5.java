public class Prob5{
	public static void main(String [] args){
		int length=36;
		int breadth=36;
		int radius=36;
		
		int areaOfRec=length*breadth;
		int perimeterOfRec=2*(length+breadth);
		
		double areaOfCir=Math.PI*radius*radius;
		double perimeterOfCir=2*Math.PI*radius;
		
		System.out.println("Area of rectangle: " + areaOfRec );
		System.out.println("Perimeter of rectangle: " + perimeterOfRec);
		System.out.println("Area of circle: " + areaOfCir );
		System.out.println("Perimeter of circle: " + perimeterOfCir);
		
	}
}