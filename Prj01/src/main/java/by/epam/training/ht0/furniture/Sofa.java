package by.epam.training.ht0.furniture;

public class Sofa extends Furniture {

	public Sofa(double furnitureSquare) {
		super(furnitureSquare);
	}

	@Override
	public String toString() {
		return "Sofa (square = " + furnitureSquare + " м2)";
	}

}
