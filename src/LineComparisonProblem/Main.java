package LineComparisonProblem;

public class Main {
    public static void main(String[] args) {

        Line line1 = new Line(
                new Point(1, 1),
                new Point(5, 5)
        );

        Line line2 = new Line(
                new Point(2, 2),
                new Point(6, 6)
        );

        int result = line1.compareTo(line2);

        if (result == 0) {
            System.out.println("Both lines are equal");
        } else if (result > 0) {
            System.out.println("Line 1 is greater than Line 2");
        } else {
            System.out.println("Line 1 is smaller than Line 2");
        }
    }
}
