package in.oop.concept.exercise;

public class Tests {
	public static void main(String[] args) {
		double t = 0.0;
		Shape[] s = new Shape [3];
		s [0]  = new Circle();
		s[1] = new Rectangle();
		s[2] = new Traingle();
		Circle c=  (Circle) s[0];
		c.setRadius(5);
		
		Rectangle r  = (Rectangle)s[1];
		r.setBd(5);
		r.setLe(5);
		
		Traingle m = (Traingle) s[2];
		m.setBase(8);
		m.setHeight(8);
		for(int i = 0; i<s.length;  i++) {
			t = t+s[i].area();
		}
		System.out.println(t);
	}

}
