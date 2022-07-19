package in.oop.concept;

public class Testrectangle {
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.setColor("Yellow");
		r.setBorderwidth(34);
		r.setLength(4);
		r.setWidth(5);
		System.out.println(r.getColor());
		System.out.println(r.getBorderwidth());
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		System.out.println("Area of rectangle = " + r.area());
	}

}
