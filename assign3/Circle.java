public class Circle extends Shape{
	int radius, xCoord, yCoord;

	public Circle(){
		radius = 0;
		xCoord = 0;
		yCoord = 0;
	}

	public Circle(int r, int x, int y){
		radius = r;
		xCoord = x;
		yCoord = y;
	}

	public void setRadius(int r){
		radius = r;
	}

	public int getRadius(){
		return radius;
	}

	public double area(int r){
		 double area = Math.PI * Math.pow(r,2);
		 return area;
	}

	public double circumference(int r){
		double circumference = 2 * Math.PI * r;
		return circumference;	
	}

	public String toString(){
		return "radius: " + this.radius + "x: " + this.xCoord + "y: " + this.yCoord;
	}
}