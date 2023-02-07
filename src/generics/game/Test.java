package generics.game;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Masha", 12);

        Schoolar schoolar3 = new Schoolar("Misha", 10);
        Schoolar schoolar4 = new Schoolar("Anya", 11);

        Student student1 = new Student("Savva", 21);
        Student student2 = new Student("Kseniya", 20);

        Employee employee1 = new Employee("Evgenyy", 33);
        Employee employee2 = new Employee("Kirill", 35);

        Team<Schoolar> schoolarTeam = new Team<>("Dragon");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);

        Team<Schoolar> schoolarTeam2 = new Team<>("Keks");
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        //schoolar.addNewParticipant(student1); т.к это generic студентов в школьники не добавить

        Team<Student> studentTeam = new Team<>("Wind");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("Fantasy");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        //Team<String> anotherTeam = new Team<>("asda"); //чтобы не было команд ЧЕГО УГОДНО делаем наследование T от Participant

//        schoolarTeam.playWith(studentTeam); //чтобы школьники играли только со школьниками, надо в функции также
        // установить определенный тип команды

        schoolarTeam.playWith(schoolarTeam2);



    }
}
