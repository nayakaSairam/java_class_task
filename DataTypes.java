public class DataTypes {
    public void displayStudentInfo(String name, int age, double gpa, boolean isEnrolled) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Enrolled: " + isEnrolled);
    }

    public static void main(String[] args) {
        DataTypes dt = new DataTypes();
        dt.displayStudentInfo("Alice", 20, 3.8, true);
    }
}
