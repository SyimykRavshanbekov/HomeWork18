public class Kvartira implements KomUsluga{
    private Person[] family;

    public Kvartira(Person[] family) {
        this.family = family;
    }

    @Override
    public void KomUslugaToloo() {
        System.out.println("Biz kom toloibuz");
    }

    public void getFamilies(){
        System.out.println("---------------FAMILIES WHO LIVE IN APARTMENTS-----------------------");
        for (Person i: family) {
            i.getName();
        }
    }
}
