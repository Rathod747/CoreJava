package in.oop.concept;

public class TestShape2 {
	public static void main(String[] args) {
	    Shape2 c = new Shape2();
	    
		c.setColor("red");
		c.setBorderwidth(6);
		c.setRadius(2);
		System.out.println(c.getColor());
		System.out.println(c.getBorderwidth());
		System.out.println(c.getRadius());
		System.out.println(c.area());
		
}

}
