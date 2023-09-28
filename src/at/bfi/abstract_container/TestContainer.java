package at.bfi.abstract_container;

class TestContainer {
	public static void main(String[] args) {

		GraphicsElement c1 = new Circle(4);
		GraphicsElement c2 = new Circle(6);
		GraphicsElement c3 = new Circle(8);
		GraphicsElement c4 = new Circle(10);

		GraphicsElement r1 = new Rectangle(6, 4);
		GraphicsElement r2 = new Rectangle(8, 6);
		GraphicsElement r3 = new Rectangle(10, 8);
		GraphicsElement r4 = new Rectangle(12, 10);

		Rectangle addedRect1 = new Rectangle(14, 12);
		Rectangle addedRect2 = new Rectangle(16, 14);

		Circle addedCircle1 = new Circle(12);
		Circle addedCircle2 = new Circle(14);

		GraphicsElement[] graphicsElements = { c1, r1, c2, r2, c3, r3 };

		Container graphicsContainer = new Container(graphicsElements);

		System.out.println("Original Container nach dem Erstellen: ");
		System.out.println(graphicsContainer + "\n");
		
		System.out.print("Original Laenge des Containers: ");
		System.out.print(graphicsContainer.getSize() + "\n\n");

		graphicsContainer.addItem(addedRect1);
		graphicsContainer.addItem(addedCircle1);
		
		System.out.println("Container mit zwei neuen Objekten: ");
		System.out.println(graphicsContainer + "\n");
		
		System.out.print("Erstes hinzugefuegtes Objekt: ");
		System.out.print(graphicsContainer.getItem(6) + "\n\n");
		
		System.out.print("Zweites hinzugefuegtes Objekt: ");
		System.out.print(graphicsContainer.getItem(7) + "\n\n");

		System.out.print("Laenge des Containers mit den zwei neuen Objekten: ");
		System.out.print(graphicsContainer.getSize() + "\n\n");
		
		graphicsContainer.removeItem(6);
		
		System.out.print("Laenge des Containers nach entfernen eines der hinzugefuegten Objekten: ");
		System.out.print(graphicsContainer.getSize() + "\n\n");
		
		graphicsContainer.addItem(addedRect2);
		graphicsContainer.addItem(addedCircle2);
		
		System.out.println("Container mit wieder zwei neuen Objekten:");
		System.out.println(graphicsContainer + "\n");
		
		System.out.print("Neue Laenge des Containers: ");
		System.out.print(graphicsContainer.getSize() + "\n");
		
		System.out.print("Element ausserhalb des Array-Bereichs loeschen und anzeigen: ");
		graphicsContainer.removeItem(12);
		graphicsContainer.getItem(12);
		
		System.out.println("Leeren Container erstellen und Groesse ausgeben: ");
		Container emptyContainer = new Container();
		System.out.println("Array-Laenge/Groesse: " + emptyContainer.getSize());
		
	}
}
