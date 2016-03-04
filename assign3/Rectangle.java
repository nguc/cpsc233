public class Rectangle extends Shape{
	int length, width, originX, originY;

	public Rectangle(){
		super();
		this.setLength(0);
		this.setWidth(0);
	}

	public Rectangle(int l, int w, int x, int y){
		super(x,y);
		this.setLengthAndWidth(l,w);
	}

	public void setLength(int l){
		length = l;
	}

	public void setWidth(int w){
		width = w;
	}

	public void setLengthAndWidth(int l, int w){
		length = l;
		width = w;
	}

	public int getLength(){
		return length;
	}

	public int getWidth(){
		return width;
	}

	public double area(){
		double area = Math.abs(length) * Math.abs(width);
		return area;
	}

	public double circumference(){
		double circumference = (2*Math.abs(length)) + (2*Math.abs(width));
		return circumference;
	}

	public String toString(){
		return "Rectangle | Length: " + this.length + " Width: " + this.width + " Origin: " + super.getOrigin();
	}
}