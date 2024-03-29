package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapRun {
    public static void main(String[] args) {
        /*
        * Classes in map group: HashMap(sub LinkedHashMap), EnumMap, IdentityHashMap, TreeMap, WeekHashMap
        * Map allow key null
        * */
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("01212", "Hasi");
        phoneBook.put("12319","OPouisa");

        //Get all key of phoneBook
        Set<String> phoneNumbers = phoneBook.keySet();
        phoneNumbers.forEach(System.out::println);

        Set<Map.Entry<String,String>> contacts = phoneBook.entrySet();
        for (Map.Entry<String,String> contact: contacts) {
            String phoneNumber = contact.getKey();
            String name = contact.getValue();
            System.out.println("Phone Number: " + phoneNumber + " ==> Name: " + name);
        }


        Map<String, Integer> map = new HashMap<>();

        map.put("AA", null);

        Integer value = map.get("AA");
        System.out.println("AA ==> " + value);

        boolean test = map.containsKey("AA");
        System.out.println("Contains AA? " + test); // true

        test = map.containsKey("BB");
        System.out.println("Contains BB? " + test); // false
    }
}
