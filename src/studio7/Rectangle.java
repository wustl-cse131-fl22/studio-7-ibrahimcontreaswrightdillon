package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double length;
	private double width;
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;

	}

	public double area(){
		return this.length * this.width;
	}

	public double perimeter() {
		return 2*this.length + 2*this.width;
	}

	public boolean isSqure() {
		if (this.length == this.width) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isSmaller(Rectangle other) {
		if (this.area() < other.area()) {
			return true;
		}
		else {
			return false;
		}
	}
	public void drawRectangle() {
		StdDraw.rectangle(this.length, this.length, this.width, this.width);

	}

}





