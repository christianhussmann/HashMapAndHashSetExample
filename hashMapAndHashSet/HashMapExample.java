package schoolNotes.hashMapAndHashSet;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        Map<Country, String> countries = new HashMap();

        Country c1 = new Country("Italy");
        Country c2 = new Country("France");
        Country c3 = new Country("Finland");

        //adding Key/Value pairs
        countries.put(c1, "Rome");
        countries.put(c2, "Paris");
        countries.put(c3, "Helsinki");


        //retrieval of value
        System.out.println(countries.get(new Country("Finland"))); //0(1) Constant

 //       for (Object country : countries.keySet()) {
 //           System.out.println(countries.get(country));
 //       }
    }
}
