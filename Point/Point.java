//get rid of redundant code by calling mehtods or using this with parameters inside for constructors.
public class Point{

	private int xCoord, yCoord;
	public double distance;
	public int ID;
	private static int numOfPoints = 0;
	public static int activeIns=0;

	///Constructors
	public Point()
	{
		this(0,0);
	}

	public Point(int x, int y)
	{
		this.setXAndY(x,y);
		activeIns();
		ID = ++numOfPoints;
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
	public double distance(Point point)
	{
		distance = Math.sqrt(Math.pow((point.xCoord - this.xCoord),2) + Math.pow((point.yCoord - this.yCoord),2)); 
		return distance;
	}
	// static method of distance
	public static double distance(Point p1,Point p2)
	{
		return p1.distance(p2);
	}

	//Gives each object an ID number
	public int pointID()
	{
		return ID;
	}

	//Keeps track of the number of points that are active
	public int activeIns()
	{
		return activeIns++;
	}

	public String toString()
	{
		return "(" + this.xCoord + "," + this.yCoord +")";
		
	}

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