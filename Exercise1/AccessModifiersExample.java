public class AccessModifiersExample {
    private String studentName; 
    private int studentID;

    public AccessModifiersExample(String name, int id) {
        this.studentName = name;
        this.studentID = id;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public int getStudentID() {
        return studentID;
    }

    public static void main(String[] args) {
        AccessModifiersExample student = new AccessModifiersExample("Alice", 101);
        System.out.println("Name: " + student.getStudentName());
        System.out.println("ID: " + student.getStudentID());
    }
}
