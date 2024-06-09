package areademo;

public class ractangle {
	private double length,width;
	
	public void setArea(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getArea() {
        return length * width;
    }

 public double getPerimeter() {
        return 2 * (length + width);
    }

}
