package by.epam.training.ht0.runner;

import by.epam.training.ht0.building.Building;
import by.epam.training.ht0.building.Room;
import by.epam.training.ht0.element.Bulb;
import by.epam.training.ht0.furniture.Armchair;
import by.epam.training.ht0.furniture.Bed;
import by.epam.training.ht0.furniture.Carpet;
import by.epam.training.ht0.furniture.Chair;
import by.epam.training.ht0.furniture.ClothesHanger;
import by.epam.training.ht0.furniture.Sofa;
import by.epam.training.ht0.furniture.Table;
import by.epam.training.ht0.furniture.Wardrobe;
import by.epam.training.ht0.util.IlluminanceTooMuchException;
import by.epam.training.ht0.util.SpaceUsageTooMuchException;

public class Main {

	public static void main(String[] args) throws IlluminanceTooMuchException, SpaceUsageTooMuchException {

		Building building = new Building("Building 1");

		building.addRoom(new Room("Bedroom", 15, 2));

		building.getRoom("Bedroom").addFurniture(new Table(1));
		building.getRoom("Bedroom").addFurniture(new Chair(1));
		building.getRoom("Bedroom").addFurniture(new Wardrobe(3));
		building.getRoom("Bedroom").addFurniture(new Bed(4));
		building.getRoom("Bedroom").addBulb(new Bulb(220));
		building.getRoom("Bedroom").addBulb(new Bulb(150));

		building.addRoom(new Room("Siting room", 20, 4));
		building.getRoom("Siting room").addBulb(new Bulb(320));
		building.getRoom("Siting room").addBulb(new Bulb(200));
		building.getRoom("Siting room").addBulb(new Bulb(150));
		building.getRoom("Siting room").addFurniture(new Table(4));
		building.getRoom("Siting room").addFurniture(new Chair(1));
		building.getRoom("Siting room").addFurniture(new Chair(1));
		building.getRoom("Siting room").addFurniture(new Chair(1));
		building.getRoom("Siting room").addFurniture(new Chair(1));
		building.getRoom("Siting room").addFurniture(new Sofa(2));

		Building building2 = new Building("Building 2");

		building2.addRoom(new Room("Hallway", 5, 0));

		building2.getRoom("Hallway").addFurniture(new ClothesHanger(1));
		building2.getRoom("Hallway").addFurniture(new Carpet(2));
		building2.getRoom("Hallway").addBulb(new Bulb(350));

		building2.addRoom(new Room("Siting room", 15, 3));
		building2.getRoom("Siting room").addFurniture(new Table(2));
		building2.getRoom("Siting room").addFurniture(new Chair(1));
		building2.getRoom("Siting room").addFurniture(new Chair(1));
		building2.getRoom("Siting room").addFurniture(new Armchair(2));
		building2.getRoom("Siting room").addFurniture(new Armchair(2));
		building2.getRoom("Siting room").addBulb(new Bulb(150));
		building2.getRoom("Siting room").addBulb(new Bulb(250));
		
		Building building3 = new Building("Building 3");
		building3.addRoom(new Room("Guest Room", 10, 2));
		building3.getRoom("Guest Room").addFurniture(new Sofa(3));
		building3.getRoom("Guest Room").addFurniture(new Armchair(2));
		building3.getRoom("Guest Room").addBulb(new Bulb(150));
		building3.getRoom("Guest Room").addBulb(new Bulb(250));
		
		building3.addRoom(new Room("Util Room", 3, 0));
		building3.getRoom("Util Room").addBulb(new Bulb(400));
		
		building.describeBuilding();
		System.out.println(" ");
		System.out.println("------------");
		System.out.println("");
		building2.describeBuilding();
		System.out.println(" ");
		System.out.println("------------");
		System.out.println("");
		building3.describeBuilding();
	}

}
