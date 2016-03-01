public class Rectangle extends Shape{
	int length, width, originX, originY;

	public Rectangle(){
		length = 0;
		width = 0;
		originX = 0;
		originY = 0;
	}

	public Rectangle(int l, int w, int x, int y){
		this.setLength(l);
		this.setWidth(w);
		originX = x;
		originY = y;
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

	public double area(int length, int width){
		double area = length * width;
		return area;
	}

	public double circumference(int length, int width){
		double circumference = (2*length) + (2*width);
		return circumference;
	}

	public String toString(){
		return "length: " + this.length + "width: " + this.width + "origin: " + this.originX + "," + this.originY;
	}
}