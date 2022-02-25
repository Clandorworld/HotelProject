import java.util.ArrayList;

class Hotel {
    private String nameHotel;
    private ArrayList <Bedroom> bedrooms =new ArrayList<>();
    private ArrayList <Conferenceroom> conferencerooms =new ArrayList<>();

    public Hotel (String nameHotel){
        this.nameHotel = nameHotel;
    }
    public String getNameHotel(){
        return nameHotel;
    }
    public void setNameHotel (String newNameHotel){
        nameHotel =newNameHotel;
    }

    public void addBedroom(Bedroom newBedroom){
        this.bedrooms.add(newBedroom);
    }
    public boolean freeRoom(Bedroom chekoutRoom){
        return bedrooms.remove(chekoutRoom);
    }
    public int getTotalbedroom(){
        return bedrooms.size();
    }

    public void addConferencerooms(Conferenceroom newConferenceroom){
        this.conferencerooms.add(newConferenceroom);
    }
    public boolean freeRoom(Conferenceroom chekoutConference){
        return conferencerooms.remove(chekoutConference);
    }
    public int getTotalconferenceroom(){
        return conferencerooms.size();
    }
    public void checkIn(Bedroom bedroom, Guest guest){
        bedroom.guestIn(guest);
    }
    public void checkOut(Bedroom bedroom, Guest guest){
        bedroom.guestOut(guest);
    }
    public void checkIn(Conferenceroom conferenceroom, Guest guest){
        conferenceroom.guestIn(guest);
    }
    public void checkOut(Conferenceroom conferenceroom, Guest guest){
        conferenceroom.guestOut(guest);
    }
}

