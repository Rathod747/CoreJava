package in.oop.concept.exercise;

public final class Immutble {
	private final String name;
	private final int age;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	Immutble (String  name , int age){
		this.name = name;
		this.age = age;
		
	}
	public static void main(String[] args) {
		Immutble  i = new Immutble("Nikita" , 20);
		System.out.println(i.getName());
		System.out.println(i.getAge());
		
	}
	
	

}
