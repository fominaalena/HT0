package by.epam.training.ht0.furniture;

public class Armchair extends Furniture {

	public Armchair(double furnitureSquare) {
		super(furnitureSquare);
	}

	@Override
	public String toString() {
		return "Armchair (square = " + furnitureSquare + " м2)";
	}
}
