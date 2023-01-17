import java.util.ArrayList;
import java.util.List;
abstract class Shape {
	abstract void draw();
}

class Circle extends Shape {
	@Override
	void draw() {
	System.out.println("circle");
	}
}
class Rectangle extends Shape {
	@Override
	void draw() {
	System.out.println("rectangle");
	}
}

class Test {
	public static void drawShape(List<? extends Shape> lists) {
	for (Shape s : lists) {
		s.draw();
	}
	}
	
	public static void main(String args[]) {
	List<Shape> list = new ArrayList<Shape> ();
	list.add (new Rectangle());
	//List<Circle> list2 = new ArrayList<Circle> ();
	list.add (new Circle());

	drawShape (list);

}}
