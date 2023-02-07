package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test3 {
    public static void main(String[] args) {
//        List<Number> list = new ArrayList<Integer>(); нельзя
//        List<Object> list = new ArrayList<Integer>(); нельзя

        // List<?> - является супертипом для любого списка. Есть следующие ограничения:
        /*List<?> list4 = new ArrayList<String>();
        list4.add("adsas"); нельзя из-за TypeSafe. Не будет давать метод изменяющие объект при использовании wildCard*/

        // можно ограничивать wildCard:
        List<? extends Number> list30 = new ArrayList<Integer>();

        List<? super Number> list31 = new ArrayList<Object>();


        List<?> list = new ArrayList<Integer>();

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);

        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Hi");
        list2.add("Bye");
        list2.add("Good");

        showListInfo(list2);

        ArrayList<Double> ald = new ArrayList<>();
        ald.add(3.14);
        ald.add(3.15);
        ald.add(3.16);
        System.out.println(summ(ald));

        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(3);
        ali.add(35);
        ali.add(30);
        System.out.println(summ(ali));

        // можно подставлять все объекты наследуемые от Number
    }

    static void showListInfo(List<?> list){
        System.out.println("List contains next elements: " + list);
    }

    public static double summ(ArrayList<? extends Number> a1){
        double summ = 0;
        for (Number n : a1) {
            summ += n.doubleValue();
        }
        return summ;
    }
}
