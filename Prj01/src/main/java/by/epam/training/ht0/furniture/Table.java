package by.epam.training.ht0.furniture;

public class Table extends Furniture {

	public Table(double furnitureSquare) {
		super(furnitureSquare);
	}

	@Override
	public String toString() {
		return "Table (square = " + furnitureSquare + " м2)";
	}

}
