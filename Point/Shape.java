public abstract class Shape{
	int xCoord, yCoord;
	double distance;

	private Point origin;

	public Shape(){
		origin = new Point();
	}

	public Shape(int x, int y) {
		origin = new Point(x,y);
	}

	public void setOrigin(int x, int y){
		origin.setXandY(x,y);
	}

	public Point getOrigin(){
		
		return origin;
	}

	public void move(int deltaX, int deltaY){
		origin.move(deltaX,deltaY);
	}

	public double distance(Object other){
		distance = origin.distance(other); 
		return distance;
	}

	//define these methods in the other classes
	public abstract double area();

	public abstract double circumference();

	public String toString(){
		return "(" + origin.xCoord + "," + origin.yCoord +")";
	}

}
