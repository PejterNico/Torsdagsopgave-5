package task_3;

import java.util.ArrayList;

public class Building {

    final ArrayList<Room> rooms;

    int numberOfBathrooms;
    int numberOfFloors;
    int isOfficebuilding;

    public Building(ArrayList<Room> rooms, int numberOfBathrooms, int numberOfFloors, int isOfficebuilding) {
        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficebuilding = isOfficebuilding;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public int setIsOfficebuilding() {
        return isOfficebuilding;
    }
}
