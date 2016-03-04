/**
Creates point objects with defalut coordinates or coordinates that are passed in by the user, each object created will have its own unique ID number. Point objects can be moved by values entered in as deltaX and deltaY using the move method. The distance between two points can be calculated using the distance method. An object's coordinates can be set to be equal to the average of 3 other point objects. The number of active objects will also be tracked

@author Chi Nguyen
*/
public class Point{
	//Variables
	private int xCoord, yCoord;
	public int avgX,avgY;
	public double distance;
	public int ID;
	private static int numOfPoints = 0;
	public static int activeIns=0;

	/**
	Creates a point at 0,0 and assigns each point an ID number and increments the number of active instansces
	*/
	public Point()
	{
		this.setXAndY(0,0);
		activeIns();
		ID = ++numOfPoints;
	}
	/**
	Creates a point with the entered values

	@param x the value entered for the x coordinate of the point
	@param y the value entered for the y coordinate of the point
	*/
	public Point(int x, int y)
	{
		this();
		this.setXAndY(x,y);
	}
	/**
	Registers the values entered by the user to the xCoord and yCoord. X and y coordinate values can be registerd at the same time or individually

	@param x value of x entered to be set to xCoord
	@param y value of y entered to be set to yCoord
	*/
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

	/**
	Returns the value of the x or y coordinate

	@return xCoord gives value of x
	@return yCoord gives valeue of y
	*/
	public double getX()
	{
		return xCoord;
	}

	public double getY()
	{
		return yCoord;
	}

	/**
	Shifts point according to the deltaX and deltaY values

	@param deltaX value that the x coordinate of the point will move by
	@param deltaY value that the y coordinate of the pont will move by
	*/
	public void move(int deltaX, int deltaY)
	{
		this.xCoord = xCoord + deltaX;
		this.yCoord = yCoord + deltaY;
	}

	/**
	Calculates the distance between point object and a point passed in as a parameter

	@param point the point that the distance is measured to
	@return distance The calculated distance between the object and the point that is passed in
	*/
	public double distance(Point point)
	{
		distance = Math.sqrt(Math.pow((point.xCoord - this.xCoord),2) + Math.pow((point.yCoord - this.yCoord),2)); 
		return distance;
	}

	/** 
	Two points are passed in as parameters and the distance between them is calculated

	@param p1 the first point object that is passed in
	@param p2 the second point object that is passed in to calculate the distance between it and the first point
	@return distance calculated between the first point and the second point that were passed in
	*/
	public static double distance(Point p1,Point p2)
	{
		return p1.distance(p2);
	}

	/**
	Calculates the average x and y coordinates of the first three points and onverts the average values to integers.Then sets the x and y coordinates of the object to those values

	@param p1 first point object that is passed in
	@param p2 second point object that is passed in
	@param p3 third point object that is passed in
	*/
	public void average(Point p1,Point p2,Point p3)
	{
		avgX = (p1.xCoord + p2.xCoord + p3.xCoord)/3;
		avgY = (p1.yCoord + p2.yCoord + p3.yCoord)/3;
		this.setXAndY((int)avgX,(int)avgY);
	}

	/**
	Assigns each object an ID number

	@return returns an ID number to the object
	*/
	public int pointID()
	{
		return ID;
	}

	/**
	Keeps track of the number of active point objects, increments after every call

	@return number of active points
	*/
	public int activeIns()
	{
		return activeIns++;
	}

	/**
	Allows the point objects to be displayed as a string

	@return object information as a string in the form: (x,y)
	*/
	public String toString()
	{
		return "(" + this.xCoord + "," + this.yCoord +")";
	}

	/**
	Garbage collection, deletes objects that are no longer referenced to from memeory and the number of active instances will be decremented for each object that is deleted
	*/
	protected void finalize() throws Throwable
	{
		super.finalize();
		activeIns--;
	}

	public static void fullGC()
	{
		Runtime rt = Runtime.getRuntime();
		long isFree = rt.freeMemory();
		long wasFree;
		do{
			wasFree = isFree;
			rt.runFinalization();
			rt.gc();
			isFree = rt.freeMemory();
		}while(isFree>wasFree);
	}
}