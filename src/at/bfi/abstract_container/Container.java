package at.bfi.abstract_container;

class Container extends AbstractContainer{
	
	private GraphicsElement[] graphicsElements;

	public Container() {
		graphicsElements = new GraphicsElement[0];
		
		System.out.println("Default Konstruktor verwendet. Ein Array mit 0 Laenge erstellt");
	}

	public Container(int containerSize) {
		graphicsElements = new GraphicsElement[containerSize];
		
		System.out.println("Parametrisierter Konstruktor mit Laenge " + graphicsElements.length);
	}
	
	public Container(GraphicsElement[] graphicsElements) {
		this.graphicsElements = new GraphicsElement[graphicsElements.length];
		
		for (int index = 0; index < graphicsElements.length; index++) {
			this.graphicsElements[index] = graphicsElements[index]; 
		}
   }

	@Override
	public void addItem(GraphicsElement addedElement) {
		GraphicsElement[] tempElements = new GraphicsElement[this.graphicsElements.length + 1];
		
		for (int index = 0; index < graphicsElements.length; index++) {
			tempElements[index] = graphicsElements[index];
		}
		
		tempElements[tempElements.length -1] = addedElement;
		
		graphicsElements = new GraphicsElement[tempElements.length];

		for (int index = 0; index < tempElements.length; index++) {
			 graphicsElements[index] = tempElements[index];
		}
		
		tempElements = null;
	}

	@Override
	public GraphicsElement getItem(int returnIndex) {
		if(returnIndex >= 0 && returnIndex < graphicsElements.length) {
			return graphicsElements[returnIndex];	
		}
		System.out.println("Sie versuchen ein Element ausserhalb des Bereichs zu holen, bitte eine Zahl zwischen 0 und " + ( graphicsElements.length - 1 ) + " verwenden.\n");
		return null; 
	}

	@Override
	public void removeItem(int removeIndex) {
		if(removeIndex >= 0 && removeIndex < graphicsElements.length) {
			GraphicsElement[] tempElements = new GraphicsElement[this.graphicsElements.length - 1];
			
			for (int index = 0; index < tempElements.length; index++) {
				if (index != removeIndex) {
					tempElements[index] = graphicsElements[index];
				}
			}
			
			graphicsElements = new GraphicsElement[tempElements.length];
	
			for (int index = 0; index < tempElements.length; index++) {
				 graphicsElements[index] = tempElements[index];
			}
			
			tempElements = null;
		} else {
			System.out.println("Sie versuchen ein Element ausserhalb des Bereichs zu loeschen, bitte eine Zahl zwischen 0 und " + ( graphicsElements.length - 1 ) + " verwenden.\n");
		}
	}

	@Override
	public int getSize() {
		return graphicsElements.length;
	}

	@Override
	public String toString() {
		return "Container [graphicsElements=" + getOutput() + "]";
	}
	
	public String getOutput() {
		
		String preparedOutput = "";
		
		for (GraphicsElement graphicsElement : graphicsElements) {
			if (graphicsElement instanceof Circle) {
				preparedOutput += (Circle) graphicsElement;
			}
			if (graphicsElement instanceof Rectangle) {
				preparedOutput += (Rectangle) graphicsElement;
			}
		}
		
		return preparedOutput;
	}

	
}
