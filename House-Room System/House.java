
import java.util.ArrayList;
import java.util.List;

public class House {
    private String address;
    private List<Room> rooms;

    public House(String address){
        this.address = address;
        rooms = new ArrayList<>();
    }

    public void addRoom(Room r){
        rooms.add(r);
    }
      
}
