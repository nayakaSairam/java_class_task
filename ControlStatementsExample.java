public class ControlStatementsExample {
    public String getGradeCategory(double marks) {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "Fail";
    }

    public static void main(String[] args) {
        ControlStatementsExample control = new ControlStatementsExample();
        System.out.println("Grade for 85: " + control.getGradeCategory(85));
    }
}
