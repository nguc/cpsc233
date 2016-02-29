public abstract class Shape extends Point{
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
		Point origin = new Point(xCoord,yCoord);
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

	public double area();

	public double circumference();

	public String toString(){
		return "(" + xCoord + "," + yCoord +")";
	}

}
