package in.oop.concept.exercise;

public class Rectangle extends Shape {
private int le;
private int bd;
@Override
public double area() {
	double area = le*bd;
	return area;
}
public int getLe() {
	return le;
}
public void setLe(int le) {
	this.le = le;
}
public int getBd() {
	return bd;
}
public void setBd(int bd) {
	this.bd = bd;
}

}
