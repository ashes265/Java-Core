package collection.list;

import collection.obj.Book;
import collection.obj.Item;

import java.util.*;
import java.util.stream.Collectors;

public class ListRun {
    public static void main(String[] args) {
        /*
         * List - interface
         * ArrayList
         * LinkedList
         * */


        //Initial List
//        List<String> demoList = List.of("A", "B", "C");
//        System.out.println(demoList);
//
//        //Create ArrayList
//        List<String> arrayList = new ArrayList<>();
//        arrayList.add("A");
//        arrayList.add("B");
//        arrayList.add("C");
//        //Insert by index
//        arrayList.add(0, "Start");
//        System.out.println(arrayList);
//        //Remove by index - value
//        arrayList.remove(1);
//        arrayList.remove("C");
//        System.out.println(arrayList);
//
//        //Add all list
//        arrayList.addAll(demoList);
//        System.out.println(arrayList);


        //Array to List
//        String[] arr = {"S", "V", "G"};
//        List<String> parseList = Arrays.asList(arr);
//        System.out.println(parseList);

        //Iterator
        // Create a List
//        List<String> list = new ArrayList<String>();
//        list.add("One");
//        list.add("Two");
//        list.add("Three");
//        list.add("Four");
//
//        // Get a ListIterator.
//        ListIterator<String> listIterator = list.listIterator();
//
//        String first = listIterator.next();
//        System.out.println("First:" + first);// -->"One"
//
//        String second = listIterator.next();
//        System.out.println("Second:" + second);// -->"Two"
//
//        if (listIterator.hasPrevious()) {
//            System.out.println("Jump back...");
//            String value = listIterator.previous();
//            System.out.println("Value:" + value);// -->"Two"
//        }
//
//        System.out.println(" ----- ");
//
//        while (listIterator.hasNext()) {
//            String value = listIterator.next();
//            System.out.println("Value:" + value);
//        }
//
//        //Iterator only next -->>
//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        //Using stream
//        list.stream().filter(e -> e.equals("A")).forEach(System.out::println);
//
//        //Sublist
//        List<String> subList = list.subList(0, 2);
//        System.out.println(list);
//        System.out.println(subList);


        //Spliterator
//        List<Integer> numbers = new ArrayList<>();
//        for (int i = 1; i <= 10; i++) {
//            numbers.add(i);
//        }
//
//        Spliterator<Integer> spliterator = numbers.spliterator();
//
//        Spliterator<Integer> evenSpliterator = spliterator.trySplit();
//
//        // Tính tổng các số chẵn
//        int evenSum = sumNumbers(evenSpliterator);
//
//        // Tính tổng các số lẻ
//        int oddSum = sumNumbers(spliterator);
//
//        System.out.println("Left: " + evenSum);
//        System.out.println("Right: " + oddSum);

        //List To Array
//        List<String> demoList = List.of("A", "B", "C");
//        String[] arr = new String[demoList.size()];
//        demoList.toArray(arr);
//        for(String s: arr)  {
//            System.out.println(s);
//        }
//
//        //auto size by demo list
//        String[] anotherWay = demoList.toArray(demoList.toArray(new String[0]));

        //Sort
//        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 6, -1, 5));
//        //asc
//        Collections.sort(list);
//        System.out.println(list);
//        //desc
//        Collections.reverse(list);
//        System.out.println(list);
//
//        Book b1 = new Book("A", 100f);
//        Book b2 = new Book("B", 120f);
//        Book b3 = new Book("C", 300f);
//        Book b4 = new Book("D", 100f);
//        Book b5 = new Book("E", 300f);
//
//        List<Book> bookList = new ArrayList<Book>();
//        bookList.add(b1);
//        bookList.add(b2);
//        bookList.add(b3);
//        bookList.add(b4);
//        bookList.add(b5);

//        bookList.forEach(System.out::println);
//        bookList.sort(new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                float p1 = o1.getPrice();
//                float p2 = o2.getPrice();
//                if(p1 > p2) {
//                    return 1;//asc by o1 -> o2
//                } else if(p1 < p2) {
//                    return -1;//desc by o2- o1
//                } else {
//                    return 0;
//                }
//            }
//        });

//        bookList.sort(Comparator.comparingDouble(Book::getPrice));
//        bookList.sort(Comparator.comparingDouble(Book::getPrice).reversed());
//        bookList.sort(Comparator.comparingDouble(Book::getPrice)
//                .reversed()
//                .thenComparing(Book::getName));
//        System.out.println("\n=============================\nAfter sort");
//        bookList.forEach(System.out::println);

        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("A", 25.99, new Date(1234567890L)));
        itemList.add(new Item("C", 20.99, new Date(2345678901L)));
        itemList.add(new Item("B", 20.99, new Date(3456789012L)));
        itemList.add(new Item("D", 25.99, new Date(4567890123L)));

        List<Item> test  = itemList.stream().filter(a -> a.getName().equals("A")).collect(Collectors.toList());;
        // sort by name, price, date asc
//        itemList.sort(new Comparator<Item>() {
//            @Override
//            public int compare(Item o1, Item o2) {
//                if(o1.getPrice() < o2.getPrice()) {
//                    return 1;
//                } else if(o1.getPrice() > o2.getPrice()) {
//                    return -1;
//                } else {
//                    int compareStr = o2.getName().compareTo(o1.getName());
//                    if(compareStr != 0) {
//                        return compareStr;
//                    } else {
//                        return Long.compare(o1.getCreateDate().getTime(), o2.getCreateDate().getTime());
//                    }
//                }
//            }
//        });

        //use lambda
        itemList.sort(Comparator.comparingDouble(Item::getPrice).reversed()
                .thenComparing(Item::getName, Comparator.reverseOrder())
                .thenComparing(Item::getCreateDate));

        itemList.forEach(System.out::println);

    }

    private static int sumNumbers(Spliterator<Integer> spliterator) {
        //using replace array for local variable in lambda
        int[] sum = {0};
        spliterator.forEachRemaining(number -> sum[0] += number);
        return sum[0];
    }


}
