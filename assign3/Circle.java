public class Circle extends Shape{
	int radius, xCoord, yCoord;

	public Circle(){
		super();
		this.setRadius(0);
	}

	public Circle(int r, int x, int y){
		super(x,y);
		this.setRadius(r);
	}

	public void setRadius(int r){
		radius = r;
	}

	public int getRadius(){
		return radius;
	}

	public double area(){
		 double area = Math.PI * Math.pow(Math.abs(radius),2);
		 return area;
	}

	public double circumference(){
		double circumference = 2 * Math.PI * Math.abs(radius);
		return circumference;	
	}

	public String toString(){
		return "Circle | Radius: " + this.radius + " Origin: " + super.getOrigin();
	}
}