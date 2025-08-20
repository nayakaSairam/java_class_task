class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    String course;

    public Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    public void showStudent() {
        showDetails();
        System.out.println("Course: " + course);
    }
}

class Professor extends Person {
    String subject;

    public Professor(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void showProfessor() {
        showDetails();
        System.out.println("Subject: " + subject);
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        Student s = new Student("Alice", 20, "Computer Science");
        Professor p = new Professor("Dr. Smith", 45, "Mathematics");

        s.showStudent();
        p.showProfessor();
    }
}
