public abstract class Shape extends Point{
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
		origin.setXAndY(x,y);	
	}

	public Point getOrigin(){
		return origin;
	}

	public void move(int deltaX, int deltaY){
		origin.move(deltaX,deltaY);
	}

	public double distance(Point other){
		distance = origin.distance(other);
		return distance;
	}

	public abstract double area();

	public abstract double circumference();

	public String toString(){
		return "Origin: " + origin;
	}

}
