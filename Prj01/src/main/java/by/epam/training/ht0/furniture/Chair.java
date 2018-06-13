package by.epam.training.ht0.furniture;

public class Chair extends Furniture {

	public Chair(double furnitureSquare) {
		super(furnitureSquare);
	}

	@Override
	public String toString() {
		return "Chair (square = " + furnitureSquare + " м2)";
	}

}
