package in.oop.concept;

public class ArrayPolymorphism {
	public static void main(String[] args) {
		Shape2[] s = new Shape2[3];
		s[0] = new Circle ();
		s[1] = new Rectangle();
		s[2] = new Traingle();
		
		Rectangle r = (Rectangle) s[1];
		r.setLength(5);
		r.setBorderwidth(5);
		
		Traingle t = (Traingle) s[2];
	    t.setBase(5);
	    t.setHeight(5);
	    
	    Circle c = (Circle)s[0];
	    c.setRadius(5);
	    
	    
	    double total = 0.0;
	    for (int i =0; i< s.length; i++) {
			
	    	total = total + s[i].area();
			
			
			
		}
		System.out.println("Total Area =" + total);
		
		
	}

}
