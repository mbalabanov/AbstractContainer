package at.bfi.abstract_container;

abstract class AbstractContainer {

	public abstract void addItem(GraphicsElement ge);
	public abstract GraphicsElement getItem(int index);
	public abstract void removeItem(int index);
	public abstract int getSize();

}
