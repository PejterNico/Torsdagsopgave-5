package task_3;

import netscape.security.UserTarget;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Room room1 = new Room(5,8,14);
        Room room2 = new Room(2,1,2);
        Room room3 = new Room(10,1,1);
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building = new Building(2,4,1);
        int totalLamps = countLampsInBuiling(building);
        System.out.println(totalLamps);
        boolean test = isNormal(building);
        System.out.println(test);

        public static int countLampsInBuiling(Building building){
            int sum = 0;
            for(Room r :building.getRooms()){
                sum = sum + r.getNumberOfLamps();
            }
            return sum;
        }

        static boolean isNormal(Building building){
            if(building.getNumberOfFloors()>building.getRooms().size()){
                return true:
            } else{
                System.out.println("This is an odd building");
                return false;
            }

        }

    }
}
