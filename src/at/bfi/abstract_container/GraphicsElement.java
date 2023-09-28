package at.bfi.abstract_container;

abstract class GraphicsElement {
	public final static String TEXT = "Standard Ausgabe!";
	
	public abstract double calculatePerimeter();
	public abstract double calculateArea();
	
	public void ausgabe() {
		System.out.println(TEXT);
	}
}
