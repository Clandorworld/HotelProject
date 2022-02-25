import java.util.ArrayList;

class Conferenceroom {
    private String nameConference;
    private int capacity;
    private ArrayList <Guest> guestConference =new ArrayList<>();

    public Conferenceroom (String nameConference, int capacity){
        this.nameConference = nameConference;
        this.capacity = capacity;
    }


    public String getNameConference(){
        return nameConference;
    }
    public void setNameConference (String newNameConference){
        nameConference =newNameConference;
    }


    public int getCapacity(){
        return capacity;
    }
    public void setCapacity (int newCapacity){
        capacity =newCapacity;
    }


    public void guestIn(Guest newGuest){
        this.guestConference.add(newGuest);
    }
    public boolean guestOut(Guest free){
        return guestConference.remove(free);
    }
    public int getguestNumber(){
        return guestConference.size();
    }
}
