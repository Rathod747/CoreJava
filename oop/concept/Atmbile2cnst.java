
package in.oop.concept;

public class Atmbile2cnst {
	private String color;
	private int speed;
	 
	 private String make;
	 public static final int gear = 6;
	 public Atmbile2cnst() {
		  
	 }
	 public Atmbile2cnst ( String a , String d , int c ) {
		 color = a;
		 speed = c;
		 make = d;
		 
		 
	 }
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	public void  breakk() {
		if (getSpeed () >= 70) {
			System.out.println("Break");
		}
		
	}
	public void changeGear () {
		if (getSpeed () ==10) {
			System.out.println("gear = " + 1);
		}
		if (getSpeed ()==20)	 {
			System.out.println("gear =" + 2);
		}
			if (getSpeed() == 30) {
				System.out.println("gear " + 3);
			}
				if (getSpeed ()== 40) {
					System.out.println("gear" + 4); 
				}
					if (getSpeed ()==50) {
						System.out.println("gear" + 5);
					}
						if (getSpeed () ==70) {
							System.out.println("gear" + 6);
						}
					}
				
			
		
			
	
	 
	 

}
