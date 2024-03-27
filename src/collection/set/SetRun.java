package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetRun {
    public static void main(String[] args) {
        /*
         *  Set is unorder collection, element can not duplicate, can exist only one element null
         * It will ignore when you push some duplicate value exist in set
         * SortedSet is sub interface of Set --> order collection
         * Class implements Set: HashSet(sub LinkedHashSet), TreeSet, EnumSet,...
         * */

        //Set will compare value hashcode of element -> then compare by method equals to add
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        Iterator<String> ite = set.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }

        set.stream()
                .filter(v -> v.equals("a"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
