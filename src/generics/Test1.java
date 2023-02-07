package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {
        List list = new ArrayList<>(); // нельзя так делать из-за того, что при добавлении объекта другого
        // класса будет вылетать ошибка при обработке списка (стр. 21)
//        list.add("OK");
//        list.add(1);
//        list.add(new StringBuilder("asodjawp;d"));
//        list.add(new Car());

        list.add("Hi");
        list.add("Bye");
        list.add("ok");

        for (Object o : list){
            System.out.println(o + "length: " + ((String)o).length());
        }
    }
}

class Car{}
