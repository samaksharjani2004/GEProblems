package LineComparisonProblem;

public class Main {
    public static void main(String[] args) {

        Line line1 = new Line(
                new Point(0, 0),
                new Point(4, 4)
        );

        Line line2 = new Line(
                new Point(0, 0),
                new Point(4, 4)
        );

        if (line1.equals(line2)) {
            System.out.println("Both lines are equal");
        } else {
            System.out.println("Lines are not equal");
        }
    }
}
