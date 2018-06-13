package by.epam.training.ht0.building;

public interface Builder {

	public void addRoom(Room room);

	public Room getRoom(String roomName);

	public void describeBuilding();

}
