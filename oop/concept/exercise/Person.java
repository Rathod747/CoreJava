package in.oop.concept.exercise;

public class Person {
	private String firstName;
	private String lastName;
	public Person(String fn , String ln) {
		firstName = fn;
		lastName = ln;
		
	}
	public String toString() {
		return firstName + lastName;
		
	}
	public static void main(String[] args) {
		Person p = new Person("Nikita" , "Rathod");
		System.out.println(p.toString());
	}

}
