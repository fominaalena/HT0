package by.epam.training.ht0.building;

import java.util.ArrayList;
import java.util.List;

import by.epam.training.ht0.element.Bulb;
import by.epam.training.ht0.element.Window;
import by.epam.training.ht0.furniture.Furniture;
import by.epam.training.ht0.util.IlluminanceTooMuchException;
import by.epam.training.ht0.util.SpaceUsageTooMuchException;

public class Room {

	private String roomName;
	private double roomSquare;
	private int countWindow;
	private int roomIllumination;
	private final int minIllumination = 300;
	private final int maxIllumination = 4000;

	private List<Furniture> furniture = new ArrayList<Furniture>();
	private List<Bulb> bulbs = new ArrayList<Bulb>();

	public Room(String roomName, double roomSquare, int countWindow) {
		super();
		this.roomName = roomName;
		this.roomSquare = roomSquare;
		this.countWindow = countWindow;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public double getRoomSquare() {
		return roomSquare;
	}

	public void setRoomSquare(double roomSquare) {
		this.roomSquare = roomSquare;
	}

	public int getCountWindow() {
		return countWindow;
	}

	public void setCountWindow(int countWindow) {
		this.countWindow = countWindow;
	}

	public int getFurnitureSquare() {
		int squareFurniture = 0;
		for (Furniture currentFurniture : furniture) {
			squareFurniture += currentFurniture.getFurnitureSquare();
		}
		return squareFurniture;
	}

	public void addFurniture(Furniture oneFurniture) throws SpaceUsageTooMuchException {
		if (oneFurniture == null) {
			System.out.println("You entered no furniture. Please, enter one");
		}
		if (roomSquare * 0.7 >= getFurnitureSquare() + oneFurniture.getFurnitureSquare()) {
			furniture.add(oneFurniture);
		} else {
			throw new SpaceUsageTooMuchException(
					"The square is full. You can't add more furniture. Please, remove any furniture for adding new one.");
		}
	}

	public void addBulb(Bulb bulb) throws IlluminanceTooMuchException {
		int light = getTotalIllumination() + bulb.getLight();
		try {
			if (light <= maxIllumination) {
				bulbs.add(bulb);
			} else if (light > maxIllumination) {
				throw new IlluminanceTooMuchException(
						"There is too much light in the room. Illumination must be between 300 and 4000");
			}
			if (light < minIllumination) {
				System.out.println("There is not enough illumination. Illumination must be between 300 and 4000");
			}
		} catch (IlluminanceTooMuchException e) {
			System.out.println("Illumination must be between 300 and 4000");
		}

	}

	public int getBulbLight() { //only bulb illumination
		int lightBulb = 0;
		for (Bulb bulbLight : bulbs) {
			lightBulb += bulbLight.getLight();
		}
		return lightBulb;
	}

	public int getWindowLight() { //only window illumination
		int windowLight = Window.LUMINOCITY * countWindow;
		return windowLight;
	}

	public int getTotalIllumination() { //total illumination in the room
		int totalIllumination = 0;
		int windowLight = Window.LUMINOCITY * countWindow;
		int lightBulb = getBulbLight();
		totalIllumination = windowLight + lightBulb;
		return totalIllumination;

	}

	public String getUsedSquare() {
		double usedSquare = getFurnitureSquare() * 100 / roomSquare;
		return "The square of the room is used at " + usedSquare + "%";
	}
	
	public String getFreeSquare() {
		double freeSquare = 100 - (getFurnitureSquare() * 100 / roomSquare);
		return freeSquare + "%" + " of the square is free";
	}

	@Override
	public String toString() {
		return getRoomName() + "\n" + "Luminocity in the room is: " + getTotalIllumination() + " (" + countWindow
				+ " windows with " + getWindowLight() + " light and bulbs " + bulbs + " with total light " + getBulbLight() + ")"
				+ "\n" + "The square of the room is " + roomSquare + " m2" + " (" + getUsedSquare() + " and " + getFreeSquare() + ")"
				+ "\n" + "The furniture are: " + "\n" + furniture + "\n" + "Total square of furniture is "
				+ getFurnitureSquare() + " m2" + "\n";
	}

}
