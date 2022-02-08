package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args){
        List<Integer> items = new ArrayList<Integer>();
        items.add(1);
        items.add(2);
        items.add(4);
        items.add(0);
        items.add(3);
        items.add(1);
        items.add(2);
        System.out.println("---------Distinct----- ");
        items.stream().distinct().forEach(System.out::println);
        System.out.println("--------Sorted-------- ");
        items.stream().sorted().forEach(System.out::println);
        System.out.println("--------Limit--------- ");
        items.stream().skip(3).forEach(System.out::println);

        List<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        System.out.println("---------toUpperCase------");
        list.stream().map(item->item.toUpperCase()).forEach(System.out::println);
        System.out.println("---------filter-----------");
        list.stream().filter(item-> item.startsWith("T")).forEach(System.out::println);

    }
}
