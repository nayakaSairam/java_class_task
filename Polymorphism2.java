class Employee {
    public void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {
    @Override
    public void work() {
        System.out.println("Developer writes code");
    }
}

class Tester extends Employee {
    @Override
    public void work() {
        System.out.println("Tester tests software");
    }
}

class Manager extends Employee {
    @Override
    public void work() {
        System.out.println("Manager manages the team");
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Developer();
        Employee e2 = new Tester();
        Employee e3 = new Manager();

        e1.work();
        e2.work();
        e3.work();

        Employee[] employees = { new Developer(), new Tester(), new Manager() };
        for (Employee e : employees) {
            e.work();
        }
    }
}
