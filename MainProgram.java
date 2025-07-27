import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InputOutput io = new InputOutput();
        DataOperationsExample dataOp = new DataOperationsExample();
        ControlStatementsExample control = new ControlStatementsExample();
        DataTypes dt = new DataTypes();

        System.out.println("=== Student Management System ===");
        String[] studentData = io.getStudentInput();
        String name = studentData[0];
        int age = Integer.parseInt(studentData[1]);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter mark for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        double avg = dataOp.calculateAverage(marks);
        String grade = control.getGradeCategory(avg);

        System.out.println("\n--- Student Report ---");
        dt.displayStudentInfo(name, age, avg, true);
        System.out.println("Grade: " + grade);

        AccessModifiersExample student = new AccessModifiersExample(name, 1001);
        System.out.println("Student ID: " + student.getStudentID());
    }
}
