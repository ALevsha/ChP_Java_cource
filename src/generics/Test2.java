package generics;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        // можно создавать объект одного класса из дочернего ему класса
        X x = new Y();
        // но нельзя делать список из элементов дочернего ему класса. Они не будут эквивалентны
        List<X> list1 = new ArrayList</**Y*/>();
        // аналогичная ситуация
        List<Number> list = new ArrayList</**Integer*/>();
    }
}

class X{

}

class Y extends X{

}