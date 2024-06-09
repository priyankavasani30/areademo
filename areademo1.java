package areademo;

public class areademo1 {

	public static void main(String[] args) {
	
		ractangle r = new ractangle();
		r.setArea(5,3);
		System.out.println("Area of rectangle is :"+r.getArea());
		System.out.println("Area of rectangle is :"+r.getPerimeter());
		
		
		circle c = new circle();
		c.setArea(2);
		System.out.println("Area of circle is :"+c.getArea());
		System.out.println("Area of circle is :"+c.getPerimeter());
		
		
		triangle t = new triangle();
		t.setArea(2,4,3,1);
		System.out.println("Area of triangle is :"+t.getArea());
		System.out.println("Area of triangle is :"+t.getperimeter());
		
		
		
	}

}
