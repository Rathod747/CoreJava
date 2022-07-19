package in.oop.concept;

public class TestCircle {
public static void main(String[] args) {
	      Circle c = new Circle();

	      c.setBorderwidth(5);
	        c.setColor("White");
	        c.setRadius(5);
	        System.out.println(c.getColor());
	        System.out.println(c.getBorderwidth());
	        System.out.println(c.getRadius());
	        System.out.println(c.area());
}
}
 