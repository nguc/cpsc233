public abstract class Shape extends Point{
	int xCoord, yCoord;


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

}
