package in.oop.concept;

public class Testautomobile {
	public static void main(String[] args) {
		automobile a = new automobile();
		a.setColor("Yellow");
	 a.setSpeed(60);
	 a.setGear(6);
	 a.setMake("Nano");
	 System.out.println(a.getColor());
	 System.out.println(a.getGear());
	 System.out.println(a.getSpeed());
	 System.out.println(a.getMake());
	 a.changeGear();
	}

}
