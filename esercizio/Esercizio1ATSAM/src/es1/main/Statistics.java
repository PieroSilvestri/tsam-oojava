package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Statistics {

	double perimeter = 0.0;
	double area = 0.0;
	
	
	public Statistics(double perimeter, double area){
		this.perimeter = perimeter;
		this.area = area;
		
	}


	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}


	public double getPerimeter() {
		return perimeter;
	}


	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	public void add(Statistics stats){
		
		this.area += stats.getArea(); 
		this.perimeter += stats.getPerimeter();
	}
}
