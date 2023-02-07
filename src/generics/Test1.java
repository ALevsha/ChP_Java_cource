package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Две основные причины создания Generics:
 *  Type Safe - позволяет создавать списки (коллекции) ОПРЕДЕЛЕННЫХ типов, чтобы в списках не было винигрета;
 *  Reusable Code - позволяет не создавть похожие классы с определенными одинаковыми методами, они делают класс
 *  универсальным.
 */

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // нельзя делать список без параметров из-за того,
        // что при добавлении объекта другого класса будет вылетать ошибка при обработке списка (стр. 14)
//        list.add("OK");
//        list.add(1);
//        list.add(new StringBuilder("asodjawp;d"));
//        list.add(new Car());

        list.add("Hi");
        list.add("Bye");
        list.add("ok");

        for (String o : list){
            System.out.println(o + "length: " + o.length());
        }
    }
}

class Car{}
