package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Display {
	
	Shape[] shapes;
	
	
	public Shape[] getShapes() {
		return shapes;
	}

	public void setShapes(Shape[] shapes) {
		this.shapes = shapes;
	}

	public double totalPerimeter(){
		double totPerimeter = 0.0;
		for(Shape s: shapes){
			totPerimeter += s.perimeter();
		}
		return totPerimeter;
	}
	
public double totalArea(){
	double totArea = 0.0;
	for(Shape s: shapes){
		totArea += s.area();
	}
	return totArea;
	}
}
