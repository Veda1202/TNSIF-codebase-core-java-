package listdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        List list = new ArrayList(); // dynamic binding

        System.out.println(list.isEmpty());

        list.add(10);
        list.add(20);
        list.add("Sakshi");
        list.add("heti");
        list.add(false);
        list.add(true);
        list.add(20);
        list.add(12.41f);
        list.add(10);

        System.out.println("List is " + list);

        System.out.println(list.isEmpty());

        System.out.println(list.size());

        System.out.println(list.contains(1));

        list.remove(false);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        System.out.println(list.remove(list.lastIndexOf(20)));

        System.out.println(list);

        System.out.println(list.indexOf(20));

        list.clear();
        System.out.println(list);

        System.out.println("----------------------------------------------------------------");

        // Generics
        List<String> name = new ArrayList<String>();
        name.add("heti");
        name.add("heena");
        name.add("aditya");
        name.add("jay");
        name.add("aditya");
        name.add("akshay");

        System.out.println(name);

        Collections.reverse(name);
        System.out.println(name);

        System.out.println(name.contains("dilip"));

        Collections.sort(name);
        System.out.println(name);

        Collections.reverse(name);
        System.out.println(name);

        // Traversing with Iterator
        Iterator<String> i = name.iterator();
        while (i.hasNext()) {
            String nm = i.next();
            System.out.println(nm + " ");
        }

        System.out.println();
        System.out.println(name);

        // Traversing in reverse with ListIterator
        ListIterator<String> li = name.listIterator(name.size());
        while (li.hasPrevious()) {
            String nm = li.previous();
            System.out.println(nm);
        }
    }
}