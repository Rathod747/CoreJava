package in.oop.concept;

public class TestAtmbile2cnst {
	public static void main(String[] args) {
		Atmbile2cnst b = new Atmbile2cnst("Nano" , "Blue" , 70);
		System.out.println(b.getMake());
		System.out.println(b.getColor());
		System.out.println(b.getSpeed());
		System.out.println(b.gear);
		b.changeGear();
		b.breakk();
	}

}
