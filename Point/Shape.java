public abstract class Shape{
	int xCoord, yCoord;
	double distance;

	public Shape(){
		xCoord = 0;
		yCoord = 0;
	}

	public Shape(int x, int y) {
		xCoord = x;
		yCoord = y;
	}

	public void setOrigin(int x, int y){
		xCoord = x;
		yCoord = y;
	}

	public Point getOrigin(){
		// Shape myshape;Point origin = new Point();myShape = origin;
		//Point origin = new Point(xCoord,yCoord);
		super(xCoord,yCoord);
		return origin;
	}

	public void move(int deltaX, int deltaY){
		xCoord += deltaX;
		yCoord += deltaY;
	}

	public double distance(Object other){
		distance = Math.sqrt(Math.pow((other.xCoord - xCoord),2) + Math.pow((other.yCoord - yCoord),2)); 
		return distance;
	}

	//define these methods in the other classes
	public abstract double area();

	public abstract double circumference();

	public String toString(){
		return "(" + xCoord + "," + yCoord +")";
	}

}
