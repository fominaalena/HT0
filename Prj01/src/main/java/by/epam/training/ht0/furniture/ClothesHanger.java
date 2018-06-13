package by.epam.training.ht0.furniture;

public class ClothesHanger extends Furniture {

	public ClothesHanger(double furnitureSquare) {
		super(furnitureSquare);
	}

	@Override
	public String toString() {
		return "Clothes Hanger (square = " + furnitureSquare + " м2)";
	}
}
