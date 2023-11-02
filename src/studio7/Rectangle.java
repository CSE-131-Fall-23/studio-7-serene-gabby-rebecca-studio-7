package studio7;

public class Rectangle {
	private double length;
	private double width;

	public Rectangle(double initLength, double initWidth) {
		this.length = initLength;
		this.width = initWidth;
	}

	public double Area() {
		double area = length * width;
		return area;
	}

	public double Perimeter() {
		double perimeter = 2 * (length + width);
		return perimeter;
	}

	public boolean Compare(Rectangle other) {
		double a1 = this.Area();
		double a2 = other.Area();
		if (a1 < a2) {
			return true;
		} else {
			return false;
		}
	}

	public boolean squareTest() {
		if (this.length == this.width) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(5.0, 3.0);
		Rectangle r2 = new Rectangle(2.0, 2.0);
		System.out.println(r1.Compare(r2));
		System.out.println(r2.squareTest());
//		System.out.println(r1.Area());
//		System.out.println(r1.Perimeter());
	}

}
