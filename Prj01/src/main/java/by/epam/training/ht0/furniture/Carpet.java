package by.epam.training.ht0.furniture;

public class Carpet extends Furniture {

	public Carpet(double furnitureSquare) {
		super(furnitureSquare);
	}

	@Override
	public String toString() {
		return "Carpet (square = " + furnitureSquare + " м2)";
	}
}
