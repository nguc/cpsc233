class Temperature {
	double temp;

	public Temperature(double temp)
	{
		this.setTemp(temp);
	}

	public void setTemp(double temp)
	{
		this.temp = temp;
	}

	public double getTemp()
	{
		return temp;
	}

	public static double create(Sensor object)
	{
		double temp = object.getReading();
		Temperature newTemp = new Temperature(temp);
		return newTemp.getTemp();
	}

}

