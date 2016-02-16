package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Rectangle extends Shape{
	
	private double height;
	private double width;
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	@Override
	public double area(){
		
		return (height * width);
	}
	
	@Override
	public double perimeter(){
		
		return (height * 2) + (width * 2);
	}
	
	
	
}
