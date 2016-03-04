
	/**
	Initializes a 'rectangle' whose length and with are set to zero by default or can be determined by user input. The origin of the rectangle is set by the super class Shape and is set to 0,0 by default or can be determined by user input.

	@author Chi Nguyen
	*/
public class Rectangle extends Shape{
	int length, width, originX, originY;

	/**
	Creates a Rectangle object with origin set to 0,0 and length and width set to 0 as well	
	*/
	public Rectangle(){
		super();
		this.setLength(0);
		this.setWidth(0);
	}

	/**
	Creates a Rectangle object with its dimensions set by the user

	@param l value entered for length
	@param w value entered for width
	@param x value entered for x coordinate of origin
	@param y value entered for y coordinate of origin
	*/
	public Rectangle(int l, int w, int x, int y){
		super(x,y);
		this.setLengthAndWidth(l,w);
	}

	/**
	Sets the value entered by the user as the object's length

	@param l user input value of length
	*/
	public void setLength(int l){
		length = l;
	}

	/**
	Sets the value entered by the user as the object's width

	@param w user input value of width
	*/
	public void setWidth(int w){
		width = w;
	}

	/**
	Sets the values entered by the user as the object's length and width
	@param l user input value for length
	@param w user input value for width
	*/
	public void setLengthAndWidth(int l, int w){
		length = l;
		width = w;
	}

	/**
	Returns the value of length

	@return length value of the rectangle's length
	*/
	public int getLength(){
		return length;
	}

	/**
	Returns the value of width

	@return width value of the rectangle's width
	*/
	public int getWidth(){
		return width;
	}

	/**
	Returns the calculated area of the rectangle

	@return area calculated area using the dimensions of the rectangle
	*/
	public double area(){
		double area = Math.abs(length) * Math.abs(width);
		return area;
	}

	/**
	Returns the calculated circumference (perimeter) of the rectangle

	@return circumference calculated circumference using the dimensions of the rectangle
	*/
	public double circumference(){
		double circumference = (2*Math.abs(length)) + (2*Math.abs(width));
		return circumference;
	}

	/**
	Displays the information of Rectangle as a string

	@return rectangle information as a string
	*/
	public String toString(){
		return "Rectangle | Length: " + this.length + " Width: " + this.width + " Origin: " + super.getOrigin();
	}
}