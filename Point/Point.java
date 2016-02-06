public class Point{

	private int xCoord, yCoord;
	private double distance;
	private int ID;
	private int noOfPoints = 1;
	public static int activePoints=0;

	///Constructors
	public Point()
	{
		xCoord = 0;
		yCoord = 0;
		pointID();
		activePoints++;
	}

	public Point(int x, int y)
	{
		this();
		xCoord = x;
		yCoord = y;
	}

	//Set methods
	public void setXAndY(int x, int y)
	{
		xCoord = x;
		yCoord = y;
	}

	public void setX(int x)
	{
		xCoord = x;
	}

	public void setY(int y)
	{
		yCoord = y;
	}

	//Get methods
	// use /**   */ for javadoc comment
	public int getX()
	{
		return xCoord;
	}

	public int getY()
	{
		return yCoord;
	}

	//Shifts point according to the deltaX and deltaY values
	public void move(int deltaX, int deltaY)
	{
		xCoord = xCoord + deltaX;
		yCoord = yCoord + deltaY;
	}

	//Calculates the distance between point object and a point passed in as a parameter
	public double distance(int x, int y)
	{
		distance = Math.sqrt(Math.pow((x - xCoord),2) + Math.pow((y - yCoord),2)); 
		return distance;
	}

	//Gives each object an ID number
	public void pointID()
	{
		ID = noOfPoints;
	}

	/*Keeps track of the number of points that are active
	public static int activePoints()
	{
		return noOfPoints;
	}*/

	public double distance(Point point1,Point point2){
		distance = distance(point1,point2);
		return distance;
	}

	public String toString(){
		String pointCoord = xCoord + "," + yCoord;
		return pointCoord;
	}
}