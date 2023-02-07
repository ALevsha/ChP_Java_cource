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
// для конкретных задач используются отдельные буквы. При компиляции вместо T всегда подставляется Object
// Если ограничивать, то будет подставляться самый высокий класс в иерархии наследования. Можно наследоваться только
// от 1 класса и от любого количества интерфейсов их можно перечислить через знак &

class Info <T /*extends Number&I1&I2 подставляем только подклассы Number!!!*/>{
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

interface I1{}
interface I2{}