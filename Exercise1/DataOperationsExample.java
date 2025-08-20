public class DataOperationsExample {
    public double calculateAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    public static void main(String[] args) {
        DataOperationsExample dataOp = new DataOperationsExample();
        int[] marks = {85, 90, 78};
        System.out.println("Average: " + dataOp.calculateAverage(marks));
    }
}
