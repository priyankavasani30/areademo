package areademo;

public class circle {
	 private double radius;

	    public void setArea(double radius) {
	        this.radius = radius;
	    }

	    public double getArea(){
	        return 3.14* radius * radius;
	    }
	    public double getPerimeter(){
	        return 2 * 3.14 * radius;
	    }

}
