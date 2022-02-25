import java.util.ArrayList;

class Bedroom {
    private String nameBedroom;
    private int capacity;
    private String typeRoom;
    private Double price;
    private ArrayList <Guest> roomGuests =new ArrayList<>();

    public Bedroom (String nameBedroom, int capacity, String typeRoom, Double price){
        this.nameBedroom = nameBedroom;
        this.capacity = capacity;
        this.typeRoom = typeRoom;
        this.price = price;
    }


    public String getNameBedroom(){
        return nameBedroom;
    }
    public void setNameBedroom (String newNameBedroom){
        nameBedroom =newNameBedroom;
    }


    public int getCapacity(){
        return capacity;
    }
    public void setCapacity (int newCapacity){
        capacity =newCapacity;
    }


    public String getTypeRoom(){
        return typeRoom;
    }
    public void setTypeRoom (String newTypeRoom){
        typeRoom =newTypeRoom;
    }


    public Double getPrice(){
        return price;
    }
    public void setPrice (Double newPrice){
        price =newPrice;
    }

    public void guestIn(Guest newGuest){
        this.roomGuests.add(newGuest);
    }
    public boolean guestOut(Guest free){
        return roomGuests.remove(free);
    }
    public int getguestNumber(){
        return roomGuests.size();
    }
}
