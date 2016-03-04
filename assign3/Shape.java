/**
Initializes origin point for each object using the Point class. Origin default is set to coordinates 0,0. Origin can also be set by using input values from user. 

@author Chi Nguyen
*/
public abstract class Shape{
	int xCoord, yCoord;
	double distance;

	private Point origin;

	/**
	Creates a point object at 0,0 which is set to the private variable origin.
	*/
	public Shape(){
		origin = new Point();
	}

	/**
	Creates point object with values passed in. Point is set to variable origin.

	@param x value enterd for x coordinate of origin
	@param y value enterd for y coordinate of origin
	*/
	public Shape(int x, int y) {
		origin = new Point(x,y);
	}

	/**
	Sets the values entered by the user as the new origin coordinates

	@param x entered value of x coordinate to be set to origin
	@param y entered value of y coordinate to be set to origin
	*/
	public void setOrigin(int x, int y){
		origin.setXAndY(x,y);	
	}

	/**
	Returns the coordinates of the origin

	@return origin gives coordinates of the origin
	*/
	public Point getOrigin(){
		return origin;
	}

	/**
	Shifts the origin according to the deltaX and deltaY values

	@param deltaX value that the x coordinate of the origin will move by
	@ param deltaY value that the y coordinate of the origin will move by
	*/
	public void move(int deltaX, int deltaY){
		origin.move(deltaX,deltaY);
	}

	/**
	Calculates the distance between a Shape object and another Shape that is passed in

	@paramt other shape that the distance is measured from
	@return distance the calculated distance between the object and the other object that is passed in
	*/
	public double distance(Shape other){
		distance = Math.sqrt(Math.pow((other.xCoord - xCoord),2) + Math.pow((other.yCoord - yCoord),2)); 
		return distance;
	}


	public abstract double area();

	public abstract double circumference();

	/**
	Displays Shape information as a string

	@return Shape imformatin as a sttring in the form Origin: (x,y)
	*/
	public String toString(){
		return "Origin: " + origin;
	}

}
