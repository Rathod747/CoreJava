package in.oop.concept;

public class Testtraingle {
	public static void main(String[] args) {
		Traingle t =new Traingle();
		t.setColor("blue");
		t.setBorderwidth(45);
		t.setBase(4);
		t.setHeight(7);
		System.out.println(t.getColor());
		System.out.println(t.getBorderwidth());
		System.out.println(t.getBase());
		System.out.println(t.getHeight());
		System.out.println( "Area of Traingle  = " +t.area());
		
	}

}
