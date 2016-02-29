import java.util.Scanner;
class Sensor{
	public double reading;

	public Sensor(double scan)
	{
		this.setReading(scan);
	}
	public void setReading(double scan)
	{
		reading = scan;
	}

	public double getReading()
	{
		return reading;
	}

public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the temperature: ");
	double temperature = input.nextDouble();
	Temperature temp1 = new Temperature(temperature);
	Sensor sensor1 = new Sensor(15);
	System.out.println("The temperature is " + temp1.getTemp());
	
	System.out.println("the sensor temperature is " + temp1.create(sensor1)); 
}
}