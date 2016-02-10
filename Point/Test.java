// for UML public: +, Private: -, Protected: #
//put all html files into a zip file
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
		System.out.println("Current number of points: " + Point.activeIns);

		/*System.out.println("Enter an x value for point 2: ");
		xCoord = userInput.nextInt();
		System.out.println("Enter a y value for point 2: ");
		yCoord = userInput.nextInt();*/
		Point point2 = new Point();
		System.out.println("Current number of points: " + Point.activeIns);

/*
		System.out.println("Enter an x value for point 3: ");
		xCoord = userInput.nextInt();
		System.out.println("Enter a y value for point 3: ");
		yCoord = userInput.nextInt();*/
		Point point3 = new Point();

		point1.move(2,2);
		System.out.println("move point:" + point1);
		Point.distance(point1,point2);
		//System.out.println("distance: " distance);
		System.out.println("Point 1: " + point1);
		
		System.out.println("Point 2: " + point2);

		System.out.println("Point 3: " + point3);
		System.out.println("Point 1 ID: " + point1.ID);
		System.out.println("Point 2 ID: " + point2.ID);
		System.out.println("Point 3 ID: " + point3.ID);
		System.out.println("Current number of points: " + Point.activeIns);

		point1 = null;
		
		Point.fullGC();
		System.out.println("Current number of points: " + Point.activeIns);

		Point point4 = new Point(3,7);
		System.out.println("Point 4 ID: " + point4.ID);
		System.out.println("Current number of points: " + Point.activeIns);

		



	}
}