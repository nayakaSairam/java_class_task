import java.util.Scanner;

public class InputOutput {
    public String[] getStudentInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        String age = sc.nextLine();
        return new String[]{name, age};
    }

    public static void main(String[] args) {
        InputOutput io = new InputOutput();
        String[] data = io.getStudentInput();
        System.out.println("Student Name: " + data[0] + ", Age: " + data[1]);
    }
}
