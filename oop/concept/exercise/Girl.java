package in.oop.concept.exercise;

public class Girl extends Human {
 public static void dance() {
	 System.out.println("girl  is dancing");
 }
 public static void main(String[] args) {
	Girl n = new Girl();
	Human.dance();
	n.dance();
}
 
}
