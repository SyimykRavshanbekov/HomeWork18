public class Hotel implements Arenda{
    private Person[] family;

    public Hotel(Person[] family) {
        this.family = family;
    }

    @Override
    public void ArendaToloo() {
        System.out.println("Biz arenda toloibuz");
    }

    public void getFamilies(){
        System.out.println("---------------FAMILIES WHO LIVE IN HOTEL-----------------------");
        for (Person i: family) {
            i.getName();
        }
    }
}
