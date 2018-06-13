package by.epam.training.ht0.furniture;

public class Bed extends Furniture {

	public Bed(double furnitureSquare) {
		super(furnitureSquare);
	}

	@Override
	public String toString() {
		return "Bed (square = " + furnitureSquare + " м2)";
	}
}
