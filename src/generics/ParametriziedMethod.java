package generics;

import java.util.ArrayList;

public class ParametriziedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(10);
        arrayList1.add(20);
        arrayList1.add(5);
        int a = GenMethod.getSecondElement(arrayList1);
        System.out.println(a);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Hi");
        arrayList2.add("Sqwedqwd");
        arrayList2.add("SADQWAE");
        String b = GenMethod.getSecondElement(arrayList2);
        System.out.println(b);
    }
}

class GenMethod{
    // static - просто для удобства. В методах также для ограничения используется extends T
    public static <T /*extends Number*/> T getSecondElement(ArrayList<T> arrayList){
        return arrayList.get(1);
    }
}
