public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Syimyk");
        Person person2 = new Person("Bakai");
        Person person3 = new Person("Samarbek");
        Person person4 = new Person("Argen");
        Person person5 = new Person("Eldiar");
        Person person6 = new Person("Zhumgalbek");
        Person person7 = new Person("Nursultan");
        Person person8 = new Person("Kairat");
        Person person9 = new Person("Oroz");


        Person[] people1 = {person1, person2, person3, person9};
        Person[] people2 = {person4, person5, person6};
        Person[] people3 = {person7, person8};

        Kvartira kvartira1 = new Kvartira(people1);
        Obshezhitie obshezhitie1 = new Obshezhitie(people2);
        Hotel hotel1 = new Hotel(people3);

        kvartira1.getFamilies();
        kvartira1.KomUslugaToloo();
        obshezhitie1.getFamilies();
        obshezhitie1.ArendaToloo();
        hotel1.getFamilies();
        hotel1.ArendaToloo();
    }
}