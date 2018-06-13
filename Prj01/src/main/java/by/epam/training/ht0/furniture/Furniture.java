package by.epam.training.ht0.furniture;

public abstract class Furniture {

	double furnitureSquare;

	public Furniture(double furnitureSquare) {
		super();
		this.furnitureSquare = furnitureSquare;
	}

	public double getFurnitureSquare() {
		return furnitureSquare;
	}

	public void setFurnitureSquare(double furnitureSquare) {
		this.furnitureSquare = furnitureSquare;
	}

	@Override
	public String toString() {
		return "Furniture [furnitureSquare=" + furnitureSquare + "]";
	}

}
