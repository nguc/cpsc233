import java.util.Scanner;

class Test{
	public static void main(String[] args){
		//Scanner object to take in user input
		Scanner userInput = new Scanner(System.in);
		int xCoord, yCoord;

		//prompt user for coordinates of first point
		System.out.println("Enter an x value for point 1: ");
		xCoord = userInput.nextInt();
		System.out.println("Enter a y value for point 1: ");
		yCoord = userInput.nextInt();
		Point point1 = new Point(xCoord,yCoord);

		//prompt user for coordinates of second point
		System.out.println("Enter an x value for point 2: ");
		xCoord = userInput.nextInt();
		System.out.println("Enter a y value for point 2: ");
		yCoord = userInput.nextInt();
		Point point2 = new Point(xCoord,yCoord);

		//prompt user for coordinates of third point
		System.out.println("Enter an x value for point 3: ");
		xCoord = userInput.nextInt();
		System.out.println("Enter a y value for point 3: ");
		yCoord = userInput.nextInt();
		Point point3 = new Point(xCoord,yCoord);

		//prompt user for deltaX and deltaY values to use in the move method
		int deltaX,deltaY;
		System.out.println("Enter a value for deltaX: ");
		deltaX = userInput.nextInt();
		System.out.println("Enter a value for deltaY: ");
		deltaY = userInput.nextInt();

		//display point 1,2, and 3 coordinates
		System.out.println("Point 1: " + "ID#  " + point1.ID + "\t" + point1);
		System.out.println("Point 2: " + "ID#  " + point2.ID + "\t" + point2);
		System.out.println("Point 3: " + "ID#  " + point3.ID + "\t" + point3);

		//move points 1,2,and 3 by the values entered in for deltaX and deltaY
		point1.move(deltaX,deltaY);
		System.out.println("Point 1 moved to: " + point1);
		point2.move(deltaX,deltaY);
		System.out.println("Point 2 moved to: " + point2);
		point3.move(deltaX,deltaY);
		System.out.println("Point 3 moved to: " + point3);

		//check number of active objects
		System.out.println("Current number of active points: " + Point.activeIns);

		//instantiating a new object and measuring the distance of that object from point1, point2 and point3
		Point point4 = new Point();
		System.out.println("Point 4: ID# " + point4.ID + "\t" + point4);
		System.out.printf("Distance between points 1 and 4: %.2f %n", point4.distance(point1));
		System.out.printf("Distance between points 2 and 4: %.2f %n",point4.distance(point2));
		System.out.printf("Distance between points 3 and 4: %.2f %n",Point.distance(point4,point3));
		
		//instantiating a new object with coordinates that are the average of the first 3 points
		Point point5 = new Point();
		point5.average(point1,point2,point3);
		System.out.println("Point 5: ID# " + point5.ID + "\t" + point5);

		System.out.println("Current number of active points: " + Point.activeIns);

		//removing references of the 3 point objects to allow for removal from memory
		point1 = null;
		point2 = null;
		point3 = null;
		
		Point.fullGC();

		System.out.println("Current number of active points: " + Point.activeIns);
		userInput.close();
		



	}
}