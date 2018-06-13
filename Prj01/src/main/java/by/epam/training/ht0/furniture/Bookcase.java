package by.epam.training.ht0.furniture;

public class Bookcase extends Furniture {

	public Bookcase(double furnitureSquare) {
		super(furnitureSquare);
	}

	@Override
	public String toString() {
		return "Bookcase (square = " + furnitureSquare + " м2)";
	}

}
