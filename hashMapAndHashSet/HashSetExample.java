package schoolNotes.hashMapAndHashSet;


import java.util.HashSet;
import java.util.Set;


public class HashSetExample {
    public static void main(String[] args) {
        Set<Country> countries = new HashSet();

        Country c1 = new Country("Sweden");
        Country c2 = new Country("Norway");
        Country c3 = new Country("Denmark");
        Country c4 = new Country("Spain");
        Country c5 = new Country("England");

        if(c2.equals(c3))
            System.out.println("true");
        else
            System.out.println("false");

        countries.add(c1);
        countries.add(c2);
        countries.add(c3);
        countries.add(c4);
        countries.add(c5);


        for(Country country : countries){
            System.out.println(country);
        }


        countries.remove(c5);

        System.out.println("------------------------------------------------------");

        for(Country country : countries){
            System.out.println(country);
        }
    }
}
