package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * Если необходимо сделать кастомную сортировку по String (в обратном порядке, по количеств символов (слов) и т.д)),
 * то необходимо исопльзовать comparator, т.к он может использовать НЕестественный порядок слов
 *
 * int compare(Element e1, Element e2)
 * */

public class Test2 {
    public static void main(String[] args) {
        List <Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Zaur", "Tregulov", 12345);
        Employee emp2 = new Employee(15, "Ivan", "Petrov", 123);
        Employee emp3 = new Employee(123, "Ivan", "Sidorov", 345);
        // Arrays.sort(new Employee [] {emp1, emp2, emp3}); Всё равно не будет работать без Comparable
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.println("Before sorting \n" + list);
        Collections.sort(list, new SalaryComparator());
        System.out.println("After sorting \n" + list);
    }
}

class Employee implements Comparable<Employee>{

    /***
     * Интерфейс Comparable используется для сравнения объектов,
     * используя естественный порядок
     *
     * int compareTo(Element e)
     */
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee another) {
       /***
         * Если возвращаемое значение > 0, то текущий объект "больше" того, что пришел на вход,
         * если 0, то равен,
         * если < 0, то "меньше"
        * */

        /* классический*/

        if (this.id == another.id)
            return 0;
        else if (this.id < another.id) {
            return -1;
        }
        else return 1;

        /* метод, разница Integer

        return this.id-another.id;

         если используется объект Integer

        return this.id.compareTo(another.id);*/

        /* если сравниваем по String

        return this.name.compareTo(another.name);

        если имена одинаковые, добавляем доп. условие

        int res = this.name.compareTo(another.name);
        if(res == 0)
            res = this.surname.compareTo(another.surname);
        return res;*/

    }
}

//class IdComparator implements Comparator<Employee>{
//
//    /**
//     * @param emp1 the first object to be compared.
//     * @param emp2 the second object to be compared.
//     * разница лишь в том, что comparator сравнивает 2 разных объекта
//     */
//    @Override
//    public int compare(Employee emp1, Employee emp2) {
//        if (emp1.id == emp2.id)
//            return 0;
//        else if (emp1.id < emp2.id) {
//            return -1;
//        }
//        else return 1;
//    }
//}

class NameComparator implements Comparator<Employee>{

    /**
     * @param emp1 the first object to be compared.
     * @param emp2 the second object to be compared.
     * разница лишь в том, что comparator сравнивает 2 разных объекта
     */
    @Override
    public int compare(Employee emp1, Employee emp2) {
        int res = emp1.name.compareTo(emp2.name);
        if(res == 0)
            res = emp1.surname.compareTo(emp2.surname);
        return res;
    }
}


class SalaryComparator implements Comparator<Employee>{

    /**
     * @param emp1 the first object to be compared.
     * @param emp2 the second object to be compared.
     * разница лишь в том, что comparator сравнивает 2 разных объекта
     */
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary - emp2.salary;
    }
}

