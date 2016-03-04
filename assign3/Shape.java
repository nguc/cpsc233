/**
Initializes origin point using the Point class that 
*/
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
		origin.setXAndY(x,y);	
	}

	public Point getOrigin(){
		return origin;
	}

	public void move(int deltaX, int deltaY){
		origin.move(deltaX,deltaY);
	}

	public double distance(Shape other){
		distance = Math.sqrt(Math.pow((other.xCoord - xCoord),2) + Math.pow((other.yCoord - yCoord),2)); 
		return distance;
	}

	public abstract double area();

	public abstract double circumference();

	public String toString(){
		return "Origin: " + origin;
	}

}
