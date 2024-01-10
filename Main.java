package lab1vitualprogrammingw2;

public class Main {

	public static void main(String[] args) {
		Polygon p = new Polygon();
		Triangle t = new Triangle();
		Rectangle r = new Rectangle();
		
		p.setWidth(5);
		p.setHeight(5);
		t.setWidth(5);
		t.setHeight(5);
		r.setWidth(5);
		r.setHeight(5);
		
		System.out.println("Polygon Area :"+p.getArea());
		System.out.println("Triangle Area : "+t.getArea());
		System.out.println("Rectangle Area :"+r.calcArea());
		

	}

}
