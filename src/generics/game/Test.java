package generics.game;

import generics.Team;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Masha", 12);

        Student student1 = new Student("Savva", 21);
        Student student2 = new Student("Kseniya", 20);

        Employee employee1 = new Employee("Evgenyy", 33);
        Employee employee2 = new Employee("Kirill", 35);

        Team schoolar = new Team("Dragon");
        schoolar.addNewParticipant(schoolar1);
        schoolar.addNewParticipant(schoolar2);

        //schoolar.addNewParticipant(student1); есть возможность так делать, т.к. Team принимает любой такой класс
    }
}
