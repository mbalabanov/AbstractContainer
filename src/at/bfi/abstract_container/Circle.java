package at.bfi.abstract_container;

class Circle extends GraphicsElement{

	double radius;
	
	public Circle() {
		this.radius = 2;
	}	
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculatePerimeter() {
		return calculateCircumference();
	}
	
	private double calculateCircumference() {
		return 2 * Math.PI * radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
