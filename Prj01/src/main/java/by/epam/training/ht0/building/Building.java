package by.epam.training.ht0.building;

import java.util.ArrayList;
import java.util.List;

public class Building {

	private String buildingName;

	List<Room> rooms = new ArrayList<Room>();

	public Building(String buildingName) {
		super();
		this.buildingName = buildingName;
	}

	public void addRoom(Room room) {
		rooms.add(room);
	}

	public Room getRoom(String name) { //get room for its name
		Room neededRoom = null;
		for (Room expectedRoom : rooms) {
			if (name.equals(expectedRoom.getRoomName())) {
				neededRoom = expectedRoom;
			}
		}
		if (neededRoom == null) {
			System.out.println("There is no room with such name");
		}
		return neededRoom;
	}

	public void describeBuilding() {
		System.out.println(buildingName);
		for (Room room : rooms) {
			System.out.println(room);

		}
	}
}
