import java.util.Scanner;

class Test{
	public static void main(String[] args){
		
		//Dont forget to close scanner at the end of the program!!!!!!!!
		Scanner userInput = new Scanner(System.in);
		int xCoord, yCoord;

		System.out.println("Enter an x value for point 1: ");
		xCoord = userInput.nextInt();
		System.out.println("Enter a y value for point 1: ");
		yCoord = userInput.nextInt();
		Point point1 = new Point(xCoord,yCoord);

		System.out.println("Enter an x value for point 2: ");
		xCoord = userInput.nextInt();
		System.out.println("Enter a y value for point 2: ");
		yCoord = userInput.nextInt();
		Point point2 = new Point(xCoord,yCoord);

		System.out.println("Enter an x value for point 3: ");
		xCoord = userInput.nextInt();
		System.out.println("Enter a y value for point 3: ");
		yCoord = userInput.nextInt();
		Point point3 = new Point(xCoord,yCoord);

		System.out.println("Current number of points: " + point3.activePoints);
		



	}
}