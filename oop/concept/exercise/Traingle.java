package in.oop.concept.exercise;

public class Traingle extends Shape {
	private int base;
	private int height;
	@Override
	public double area() {
		double area = base*height;
	
		return area;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	

}
