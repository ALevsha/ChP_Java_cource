package generics;

public class ParamiterizedClass {
    public static void main(String[] args) {
        //Тип String заменяе T
        Info<String> info1 = new Info<>("Hi");
        System.out.println(info1);
        String s = info1.getValue();

        Info<Integer> info2 = new Info<>(24);
        System.out.println(info2);
        Integer k = info2.getValue();
    }
}

// Класс, где тип значения еще неизвестен. Для обозначения подставляемых классов используются заглавные латинские буквы
// для конкретных задач используются отдельные буквы

class Info <T>{
    private T value;// не может быть static

    public Info(T value){
        this.value = value;
    }

    public String toString(){
        return "{[" + value + "]}";
    }

    public T getValue(){
        return value;
    }
}