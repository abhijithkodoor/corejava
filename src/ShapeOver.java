class Circle{
	double r;
}
class Triangle{
	double b,h;
}
class Square{
	double s;
}
class Shape{
	public double calcArea(Circle c) {
		System.out.println("Circle area");
		return(3.14*c.r*c.r);
	}
	public double calcArea(Triangle t) {
		System.out.println("Circle area");
		return(0.5*t.b*t.b);
	}
	public double calcArea(Square sq) {
		System.out.println("Circle area");
		return(sq.s*sq.s);
	}
}
public class ShapeOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		Triangle t= new Triangle();
		Square sq= new Square();
		c.r=5.5;
		t.b=10;
		t.h=12;
		sq.s=20;
		Shape sh=new Shape();
		System.out.println(sh.calcArea(c));
		System.out.println(sh.calcArea(t));
		System.out.println(sh.calcArea(sq));

	}

}
