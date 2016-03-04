
	/**
	Initializes a 'circle' whose radius and origins are set to zero by default but can be determined by user input. The origin of the circle is set by the super class Shape.

	@author Chi Nguyen
	*/
	public class Circle extends Shape{
	int radius;

	/**
	Creates a Circle object with origin set to 0,0 and radius set to 0 
	*/
	public Circle(){
		super();
		this.setRadius(0);
	}

	/**
	Creates a Circle object with origin and radius set to the values entered by the user

	@param r value entered for the radius
	@param x value entered for x coordinate of the origin
	@param y value entered for y coordinate of the origin
	*/
	public Circle(int r, int x, int y){
		super(x,y);
		this.setRadius(r);
	}

	/**
	Sets the value entered by the user as the object's radius

	@param r value entered to set to radius
	*/
	public void setRadius(int r){
		radius = r;
	}

	/**
	Returns the value of radius

	@return value of the circle's radius
	*/
	public int getRadius(){
		return radius;
	}

	/**
	Returns the claculated are of the circle

	@return area calculated area using the dimensions of the circle
	*/
	public double area(){
		 double area = Math.PI * Math.pow(Math.abs(radius),2);
		 return area;
	}

	/**
	Returns the calculated circumference of the circle

	@return circumference calculated circumference using the dimensions of the circle
	*/
	public double circumference(){
		double circumference = 2 * Math.PI * Math.abs(radius);
		return circumference;	
	}

	/**
	Displays the information of the Circle as a string

	@return circle information as a string
	*/
	public String toString(){
		return "Circle | Radius: " + this.radius + " Origin: " + super.getOrigin();
	}
}