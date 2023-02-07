package comparation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sasha");
        list.add("Anya");
        list.add("Ivan");

        System.out.println("Before sorting:\n");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("After sorting:\n");
        System.out.println(list);
    }
}
