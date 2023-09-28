package at.bfi.abstract_container;

class Rectangle extends GraphicsElement{

	double width;
	double height;
	
	public Rectangle() {
		this.width = 4;
		this.height = 2;
	}	
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * width + 2 * height;
	}

	@Override
	public double calculateArea() {
		return width * height;
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

}
