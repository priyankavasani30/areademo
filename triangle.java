package areademo;

public class triangle {
	private double base,height,side1,side2;

	public void setArea(double base, double height, double side1, double side2) 
	{
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
	}
	
	 public double getArea() {
	       
		 return 0.5 * base * height;
	       
	    }

	    public double getperimeter()
	    {
	    	return side1 + side2 + base;
	    }
}
