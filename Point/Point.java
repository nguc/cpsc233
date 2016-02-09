//get rid of redundant code by calling mehtods or using this with parameters inside for constructors.
public class Point{

	private int xCoord, yCoord;
	private double distance;
	private int ID;
	private int pointCount = 1;
	public static int activePoints=0;

	///Constructors
	public Point()
	{
		this(0,0);
		pointID();
		activePoints++;
	}

	public Point(int x, int y)
	{
		this.setXAndY(x,y);
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
		//return setXandY(xCoord,yCoord);
	}

	//Calculates the distance between point object and a point passed in as a parameter
	public double distance(int x, int y)
	{
		distance = Math.sqrt(Math.pow((x - xCoord),2) + Math.pow((y - yCoord),2)); 
		return distance;
	}
	// static method of distance
	/*public static double distance(Point p1,Point p2)
	{
		Point tempObject = new Point(p1);
		return tempObject.distance(p2);
	}*/

	//Gives each object an ID number
	public void pointID()
	{
		ID = pointCount;
	}

	//Keeps track of the number of points that are active
	public int activePoints()
	{
		return pointCount;
	}

	public String toString()
	{
		return this.xCoord + "," + this.yCoord;
		
	}
	protected void finalize() throws Throwable
	{
		super.finalize();
		activePoints--;
	}
	//public static void fullGC
}