
class Runner {
    public static void main(String[] args){
        Bedroom duecentotrentasette =new Bedroom("Duecentotrentasette",4,"Suite",190.47);
        System.out.println(duecentotrentasette.getNameBedroom());
        Hotel belvedere =new Hotel("Belvedere");
        belvedere.addBedroom(duecentotrentasette);
        System.out.println(belvedere.getTotalbedroom());
        Guest rossi = new Guest("Mario Rossi");
        belvedere.checkIn(duecentotrentasette, rossi);
    }
}
