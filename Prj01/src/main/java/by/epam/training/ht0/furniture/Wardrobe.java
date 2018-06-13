package by.epam.training.ht0.furniture;

public class Wardrobe extends Furniture {

	public Wardrobe(double furnitureSquare) {
		super(furnitureSquare);
	}

	@Override
	public String toString() {
		return "Wardrobe (square = " + furnitureSquare + " м2)";
	}
}
