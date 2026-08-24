public class Room {
    private int number;
    private House house;

    public Room(int number,House house){
        this.number = number;
        this.house = house;
    }

    public House getHouse(){
        return house;
    }
}
