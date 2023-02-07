package comparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
        Collections.sort(list);
        System.out.println("After sorting \n" + list);
    }
}

class Employee implements Comparable<Employee>{

    /***
     * Если не задать критерии сравнения в интерфейсе comparable, компилятор будет ругаться, что не знает, как сравнивать
     * созданные из классов объекты
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
         */
        if (this.id == another.id)
            return 0;
        else if (this.id < another.id) {
            return -1;
        }
        else return 1;
    }
}


